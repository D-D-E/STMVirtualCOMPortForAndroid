/* Copyright 2017 Tyler Technologies Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * Project home page: https://github.com/anotherlab/xamarin-usb-serial-for-android
 * Portions of this library are based on usb-serial-for-android (https://github.com/mik3y/usb-serial-for-android).
 * Portions of this library are based on Xamarin USB Serial for Android (https://bitbucket.org/lusovu/xamarinusbserial).
 */

using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;
using System.Linq;
using System.Text;
using System.Timers;

using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Hardware.Usb;
using Android.OS;
using Android.Runtime;
using Android.Util;
using Android.Views;
using Android.Widget;

using OxyPlot.Xamarin.Android;
using OxyPlot;
using OxyPlot.Axes;
using OxyPlot.Series;

using Hoho.Android.UsbSerial.Driver;
using Hoho.Android.UsbSerial.Extensions;
using Hoho.Android.UsbSerial.Util;
using SciChart.Charting.Model;
using SciChart.Charting.Modifiers;

namespace UsbSerial
{
    [Activity(Label = "@string/app_name", LaunchMode = LaunchMode.SingleTop)]
    public class SerialConsoleActivity : Activity
    {
        static readonly string TAG = typeof(SerialConsoleActivity).Name;

        public const string EXTRA_TAG = "PortInfo";
        const int READ_WAIT_MILLIS = 200;
        const int WRITE_WAIT_MILLIS = 200;
        int startTime;

        UsbSerialPort port;

        UsbManager usbManager;
        TextView dumpTextView;
        ScrollView scrollView;
        PlotView plotView;
        Button startButton;
        Button stopButton;
        CheckBox devBox;

        struct rx_data
        {
            public int[] pin_status;
            public int time_tick;
        }
        rx_data gNewPoint;
        rx_data gOldPoint;
        List<LineSeries> series = new List<LineSeries>(8);
        
        PlotModel plotModel = new PlotModel { Title = "Usb Serial" };

        Timer plotTimer = new Timer(1);
        SerialInputOutputManager serialIoManager;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            Log.Info(TAG, "OnCreate");

            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.serial_console);

            usbManager = GetSystemService(Context.UsbService) as UsbManager;
            //titleTextView = FindViewById<TextView>(Resource.Id.demoTitle);
            dumpTextView = FindViewById<TextView>(Resource.Id.consoleText);
            scrollView = FindViewById<ScrollView>(Resource.Id.demoScroller);
            devBox = FindViewById<CheckBox>(Resource.Id.checkBox1);

            gNewPoint.pin_status = new int[8]{ 0, 0, 0, 0, 0, 0, 0, 0};
            gNewPoint.time_tick = 0;
            plotView = FindViewById<PlotView>(Resource.Id.plotView1);
            plotView.Model = CreatePlotModel();

            startButton = FindViewById<Button>(Resource.Id.startButton);
            startButton.SetBackgroundColor(Android.Graphics.Color.Green);
            stopButton = FindViewById<Button>(Resource.Id.stopButton);
            stopButton.SetBackgroundColor(Android.Graphics.Color.Gray);

            dumpTextView.Visibility = Android.Views.ViewStates.Invisible;

            plotTimer.Elapsed += plotTimerEvent;
            plotTimer.AutoReset = true;

            byte[] stt = new byte[] { 0x73, 0x74, 0x61, 0x72, 0x74 };
            byte[] stp = new byte[] { 0x73, 0x74, 0x6f, 0x70 };

            startButton.Click += delegate
            {
                startButton.SetBackgroundColor(Android.Graphics.Color.Red);
                startButton.Enabled = false;
                WriteData(stt);

                //plotTimer.Enabled = true;
            };

            stopButton.Click += delegate
            {
                startButton.SetBackgroundColor(Android.Graphics.Color.Green);
                startButton.Enabled = true;
                WriteData(stp);

                plotTimer.Stop();
                //plotTimer.Dispose();
            };

            devBox.CheckedChange += delegate
            {
                if (devBox.Checked)
                {
                    dumpTextView.Visibility = Android.Views.ViewStates.Visible;
                }
                else dumpTextView.Visibility = Android.Views.ViewStates.Invisible;
            };

            for (int i = 0; i < 8; i++)
            {
                series.Add(new LineSeries()
                {
                    MarkerType = MarkerType.Circle,
                    MarkerSize = 4,
                    MarkerStroke = OxyColors.White,
                    Smooth = false
                });
            }
        }

        private void plotTimerEvent(Object source, ElapsedEventArgs e)
        {
            //dumpTextView.Append(e.SignalTime + " ");
        } 

        private PlotModel CreatePlotModel()
        {
            {
                try
                {
                    foreach (var ser in series)
                    {
                        plotModel.Series.Add(ser);
                    }
                }
                catch (Exception e)
                {
                    dumpTextView.Append(e.ToString());
                }
            }
            return plotModel;
        }

        protected override void OnPause()
        {
            Log.Info(TAG, "OnPause");

            base.OnPause();

            if (serialIoManager != null && serialIoManager.IsOpen)
            {
                Log.Info(TAG, "Stopping IO manager ..");
                try
                {
                    serialIoManager.Close();
                }
                catch (Java.IO.IOException)
                {
                    // ignore
                }
            }
        }

        protected async override void OnResume()
        {
            Log.Info(TAG, "OnResume");

            base.OnResume();

            var portInfo = Intent.GetParcelableExtra(EXTRA_TAG) as UsbSerialPortInfo;
            int vendorId = portInfo.VendorId;
            int deviceId = portInfo.DeviceId;
            int portNumber = portInfo.PortNumber;

            Log.Info(TAG, string.Format("VendorId: {0} DeviceId: {1} PortNumber: {2}", vendorId, deviceId, portNumber));

            var drivers = await MainActivity.FindAllDriversAsync(usbManager);
            var driver = drivers.Where((d) => d.Device.VendorId == vendorId && d.Device.DeviceId == deviceId).FirstOrDefault();
            if (driver == null)
                throw new Exception("Driver specified in extra tag not found.");

            port = driver.Ports[portNumber];
            if (port == null)
            {
                //titleTextView.Text = "No serial device.";
                return;
            }
            Log.Info(TAG, "port=" + port);

            //titleTextView.Text = "Serial device: " + port.GetType().Name;

            serialIoManager = new SerialInputOutputManager(port)
            {
                BaudRate = 115200,
                DataBits = 8,
                StopBits = StopBits.One,
                Parity = Parity.None,
            };
            serialIoManager.DataReceived += (sender, e) => {
                RunOnUiThread(() => {
                    UpdateReceivedData(e.Data);
                });
            };
            serialIoManager.ErrorReceived += (sender, e) => {
                RunOnUiThread(() => {
                    var intent = new Intent(this, typeof(MainActivity));
                    StartActivity(intent);
                });
            };

            Log.Info(TAG, "Starting IO manager ..");
            try
            {
                serialIoManager.Open(usbManager);
            }
            catch (Java.IO.IOException e)
            {
                //titleTextView.Text = "Error opening device: " + e.Message;
                return;
            }
        }

        void WriteData(byte[] data)
        {
            if (serialIoManager.IsOpen)
            {
                port.Write(data, WRITE_WAIT_MILLIS);
            }
        }

        bool firstData = true;
        void DrawPlot(string data, int time)
        {
            if (firstData)
            {
                startTime = time;
                firstData = false;
            }
            gOldPoint.pin_status = gNewPoint.pin_status;
            gOldPoint.time_tick = gNewPoint.time_tick;

            int[] port = new int[8];
            for (int i = 0; i < 8; i++)
            {
                port[i] = (int)Char.GetNumericValue(data[i]);
            }
            gNewPoint.pin_status = port;
            gNewPoint.time_tick = time;

            plotView.Model = CreatePlotModel();
            for (int s = 0; s < 8; s++)
            {
                series[s].Points.Add(new DataPoint(gNewPoint.time_tick - startTime, gOldPoint.pin_status[s]));
                series[s].Points.Add(new DataPoint(time - startTime, port[s]));
            }
            dumpTextView.Append(port + ":" + time + "\r\n");

            plotView.Model = CreatePlotModel();
            plotView.InvalidatePlot(true);
            plotModel.InvalidatePlot(true);
        }

        void ConvertReceivedData(byte[] data)
        {
            var temp_port_value = "";
            var temp_time = "";
            int port = 0, time = 0;

            for (int i = 0; i < 4; i++)
                temp_port_value += Convert.ToChar(data[i]);
            Int32.TryParse(temp_port_value, out port);

            for (int i = 5; i < 11; i++)
                temp_time += Convert.ToChar(data[i]);
            temp_time = temp_time.PadLeft(6, '0');
            Int32.TryParse(temp_time, out time);

            string binary = Convert.ToString(port, 2);
            binary = binary.PadLeft(8, '0');

            var message = binary + ":" + time + "\r\n";

            DrawPlot(binary, time);
        }

        void UpdateReceivedData(byte[] data)
        {
            if(data.Length == 13 && data[4] == ':')
                ConvertReceivedData(data);
            scrollView.SmoothScrollTo(0, dumpTextView.Bottom);
        }
    }
}
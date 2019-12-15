package md57f9a05b5c149423a62b8593c73cd4226;


public class MainActivity_UsbDeviceDetachedReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("UsbSerial.MainActivity+UsbDeviceDetachedReceiver, UsbSerial", MainActivity_UsbDeviceDetachedReceiver.class, __md_methods);
	}


	public MainActivity_UsbDeviceDetachedReceiver ()
	{
		super ();
		if (getClass () == MainActivity_UsbDeviceDetachedReceiver.class)
			mono.android.TypeManager.Activate ("UsbSerial.MainActivity+UsbDeviceDetachedReceiver, UsbSerial", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_UsbDeviceDetachedReceiver (md57f9a05b5c149423a62b8593c73cd4226.MainActivity p0)
	{
		super ();
		if (getClass () == MainActivity_UsbDeviceDetachedReceiver.class)
			mono.android.TypeManager.Activate ("UsbSerial.MainActivity+UsbDeviceDetachedReceiver, UsbSerial", "UsbSerial.MainActivity, UsbSerial", this, new java.lang.Object[] { p0 });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

package md5e07839f0c19412b56301b1f15e7372ec;


public class UsbSerialRuntimeException
	extends java.lang.RuntimeException
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Hoho.Android.UsbSerial.Driver.UsbSerialRuntimeException, Android.UsbSerial", UsbSerialRuntimeException.class, __md_methods);
	}


	public UsbSerialRuntimeException ()
	{
		super ();
		if (getClass () == UsbSerialRuntimeException.class)
			mono.android.TypeManager.Activate ("Hoho.Android.UsbSerial.Driver.UsbSerialRuntimeException, Android.UsbSerial", "", this, new java.lang.Object[] {  });
	}


	public UsbSerialRuntimeException (java.lang.String p0)
	{
		super (p0);
		if (getClass () == UsbSerialRuntimeException.class)
			mono.android.TypeManager.Activate ("Hoho.Android.UsbSerial.Driver.UsbSerialRuntimeException, Android.UsbSerial", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public UsbSerialRuntimeException (java.lang.String p0, java.lang.Throwable p1)
	{
		super (p0, p1);
		if (getClass () == UsbSerialRuntimeException.class)
			mono.android.TypeManager.Activate ("Hoho.Android.UsbSerial.Driver.UsbSerialRuntimeException, Android.UsbSerial", "System.String, mscorlib:Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public UsbSerialRuntimeException (java.lang.Throwable p0)
	{
		super (p0);
		if (getClass () == UsbSerialRuntimeException.class)
			mono.android.TypeManager.Activate ("Hoho.Android.UsbSerial.Driver.UsbSerialRuntimeException, Android.UsbSerial", "Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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

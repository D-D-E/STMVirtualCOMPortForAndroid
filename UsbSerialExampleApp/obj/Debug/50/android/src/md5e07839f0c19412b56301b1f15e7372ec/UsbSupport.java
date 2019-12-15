package md5e07839f0c19412b56301b1f15e7372ec;


public class UsbSupport
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Hoho.Android.UsbSerial.Driver.UsbSupport, Android.UsbSerial", UsbSupport.class, __md_methods);
	}


	public UsbSupport ()
	{
		super ();
		if (getClass () == UsbSupport.class)
			mono.android.TypeManager.Activate ("Hoho.Android.UsbSerial.Driver.UsbSupport, Android.UsbSerial", "", this, new java.lang.Object[] {  });
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

package md5090774ef8c6a8dc791877082a589738b;


public class MainActivity_UsbSerialPortAdapter
	extends android.widget.ArrayAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\n" +
			"";
		mono.android.Runtime.register ("UsbSerialExampleApp.MainActivity+UsbSerialPortAdapter, UsbSerialExampleApp", MainActivity_UsbSerialPortAdapter.class, __md_methods);
	}


	public MainActivity_UsbSerialPortAdapter (android.content.Context p0, int p1)
	{
		super (p0, p1);
		if (getClass () == MainActivity_UsbSerialPortAdapter.class)
			mono.android.TypeManager.Activate ("UsbSerialExampleApp.MainActivity+UsbSerialPortAdapter, UsbSerialExampleApp", "Android.Content.Context, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public android.view.View getView (int p0, android.view.View p1, android.view.ViewGroup p2)
	{
		return n_getView (p0, p1, p2);
	}

	private native android.view.View n_getView (int p0, android.view.View p1, android.view.ViewGroup p2);

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

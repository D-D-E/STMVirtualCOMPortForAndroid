package mono.com.scichart.charting.visuals.axes;


public class IAxisLayoutChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.axes.IAxisLayoutChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAxisLayoutChanged:()V:GetOnAxisLayoutChangedHandler:SciChart.Charting.Visuals.Axes.IAxisLayoutChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.Axes.IAxisLayoutChangeListenerImplementor, SciChart.Android.Charting", IAxisLayoutChangeListenerImplementor.class, __md_methods);
	}


	public IAxisLayoutChangeListenerImplementor ()
	{
		super ();
		if (getClass () == IAxisLayoutChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.Axes.IAxisLayoutChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onAxisLayoutChanged ()
	{
		n_onAxisLayoutChanged ();
	}

	private native void n_onAxisLayoutChanged ();

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

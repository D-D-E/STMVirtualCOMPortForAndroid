package mono.com.scichart.charting.visuals.axes;


public class DataRangeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.axes.DataRangeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDataRangeChanged:(Lcom/scichart/charting/visuals/axes/IAxisCore;)V:GetOnDataRangeChanged_Lcom_scichart_charting_visuals_axes_IAxisCore_Handler:SciChart.Charting.Visuals.Axes.IDataRangeChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.Axes.IDataRangeChangeListenerImplementor, SciChart.Android.Charting", DataRangeChangeListenerImplementor.class, __md_methods);
	}


	public DataRangeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == DataRangeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.Axes.IDataRangeChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onDataRangeChanged (com.scichart.charting.visuals.axes.IAxisCore p0)
	{
		n_onDataRangeChanged (p0);
	}

	private native void n_onDataRangeChanged (com.scichart.charting.visuals.axes.IAxisCore p0);

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

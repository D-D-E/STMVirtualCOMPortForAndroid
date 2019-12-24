package mono.com.scichart.charting.visuals.axes;


public class VisibleRangeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.axes.VisibleRangeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVisibleRangeChanged:(Lcom/scichart/charting/visuals/axes/IAxisCore;Lcom/scichart/data/model/IRange;Lcom/scichart/data/model/IRange;Z)V:GetOnVisibleRangeChanged_Lcom_scichart_charting_visuals_axes_IAxisCore_Lcom_scichart_data_model_IRange_Lcom_scichart_data_model_IRange_ZHandler:SciChart.Charting.Visuals.Axes.IVisibleRangeChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.Axes.IVisibleRangeChangeListenerImplementor, SciChart.Android.Charting", VisibleRangeChangeListenerImplementor.class, __md_methods);
	}


	public VisibleRangeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == VisibleRangeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.Axes.IVisibleRangeChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onVisibleRangeChanged (com.scichart.charting.visuals.axes.IAxisCore p0, com.scichart.data.model.IRange p1, com.scichart.data.model.IRange p2, boolean p3)
	{
		n_onVisibleRangeChanged (p0, p1, p2, p3);
	}

	private native void n_onVisibleRangeChanged (com.scichart.charting.visuals.axes.IAxisCore p0, com.scichart.data.model.IRange p1, com.scichart.data.model.IRange p2, boolean p3);

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

package mono.com.scichart.charting.visuals.renderableSeries;


public class PieSegmentChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.renderableSeries.PieSegmentChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPieSegmentChanged:(Lcom/scichart/charting/visuals/renderableSeries/IPieSegment;)V:GetOnPieSegmentChanged_Lcom_scichart_charting_visuals_renderableSeries_IPieSegment_Handler:SciChart.Charting.Visuals.RenderableSeries.IPieSegmentChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.RenderableSeries.IPieSegmentChangeListenerImplementor, SciChart.Android.Charting", PieSegmentChangeListenerImplementor.class, __md_methods);
	}


	public PieSegmentChangeListenerImplementor ()
	{
		super ();
		if (getClass () == PieSegmentChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.RenderableSeries.IPieSegmentChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onPieSegmentChanged (com.scichart.charting.visuals.renderableSeries.IPieSegment p0)
	{
		n_onPieSegmentChanged (p0);
	}

	private native void n_onPieSegmentChanged (com.scichart.charting.visuals.renderableSeries.IPieSegment p0);

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

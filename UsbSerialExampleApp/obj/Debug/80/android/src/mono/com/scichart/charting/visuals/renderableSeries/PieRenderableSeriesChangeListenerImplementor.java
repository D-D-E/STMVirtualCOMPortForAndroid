package mono.com.scichart.charting.visuals.renderableSeries;


public class PieRenderableSeriesChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.renderableSeries.PieRenderableSeriesChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRenderableSeriesChanged:(Lcom/scichart/charting/visuals/renderableSeries/IPieRenderableSeries;)V:GetOnRenderableSeriesChanged_Lcom_scichart_charting_visuals_renderableSeries_IPieRenderableSeries_Handler:SciChart.Charting.Visuals.RenderableSeries.IPieRenderableSeriesChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.RenderableSeries.IPieRenderableSeriesChangeListenerImplementor, SciChart.Android.Charting", PieRenderableSeriesChangeListenerImplementor.class, __md_methods);
	}


	public PieRenderableSeriesChangeListenerImplementor ()
	{
		super ();
		if (getClass () == PieRenderableSeriesChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.RenderableSeries.IPieRenderableSeriesChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onRenderableSeriesChanged (com.scichart.charting.visuals.renderableSeries.IPieRenderableSeries p0)
	{
		n_onRenderableSeriesChanged (p0);
	}

	private native void n_onRenderableSeriesChanged (com.scichart.charting.visuals.renderableSeries.IPieRenderableSeries p0);

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

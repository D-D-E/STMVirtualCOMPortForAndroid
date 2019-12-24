package mono.com.scichart.charting.visuals.renderableSeries;


public class RenderableSeriesChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.renderableSeries.RenderableSeriesChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRenderableSeriesChanged:(Lcom/scichart/charting/visuals/renderableSeries/IRenderableSeries;)V:GetOnRenderableSeriesChanged_Lcom_scichart_charting_visuals_renderableSeries_IRenderableSeries_Handler:SciChart.Charting.Visuals.RenderableSeries.IRenderableSeriesChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.RenderableSeries.IRenderableSeriesChangeListenerImplementor, SciChart.Android.Charting", RenderableSeriesChangeListenerImplementor.class, __md_methods);
	}


	public RenderableSeriesChangeListenerImplementor ()
	{
		super ();
		if (getClass () == RenderableSeriesChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.RenderableSeries.IRenderableSeriesChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onRenderableSeriesChanged (com.scichart.charting.visuals.renderableSeries.IRenderableSeries p0)
	{
		n_onRenderableSeriesChanged (p0);
	}

	private native void n_onRenderableSeriesChanged (com.scichart.charting.visuals.renderableSeries.IRenderableSeries p0);

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

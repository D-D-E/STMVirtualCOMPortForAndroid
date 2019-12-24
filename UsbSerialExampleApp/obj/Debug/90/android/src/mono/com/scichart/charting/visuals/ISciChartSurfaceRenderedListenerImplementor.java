package mono.com.scichart.charting.visuals;


public class ISciChartSurfaceRenderedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.ISciChartSurfaceRenderedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRendered:(Lcom/scichart/charting/visuals/ISciChartSurfaceBase;Lcom/scichart/charting/visuals/rendering/RenderedMessage;)V:GetOnRendered_Lcom_scichart_charting_visuals_ISciChartSurfaceBase_Lcom_scichart_charting_visuals_rendering_RenderedMessage_Handler:SciChart.Charting.Visuals.ISciChartSurfaceRenderedListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.ISciChartSurfaceRenderedListenerImplementor, SciChart.Android.Charting", ISciChartSurfaceRenderedListenerImplementor.class, __md_methods);
	}


	public ISciChartSurfaceRenderedListenerImplementor ()
	{
		super ();
		if (getClass () == ISciChartSurfaceRenderedListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.ISciChartSurfaceRenderedListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onRendered (com.scichart.charting.visuals.ISciChartSurfaceBase p0, com.scichart.charting.visuals.rendering.RenderedMessage p1)
	{
		n_onRendered (p0, p1);
	}

	private native void n_onRendered (com.scichart.charting.visuals.ISciChartSurfaceBase p0, com.scichart.charting.visuals.rendering.RenderedMessage p1);

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

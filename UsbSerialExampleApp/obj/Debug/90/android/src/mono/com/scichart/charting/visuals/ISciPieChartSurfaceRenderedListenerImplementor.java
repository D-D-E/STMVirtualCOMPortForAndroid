package mono.com.scichart.charting.visuals;


public class ISciPieChartSurfaceRenderedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.ISciPieChartSurfaceRenderedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRendered:(Lcom/scichart/charting/visuals/ISciPieChartSurface;)V:GetOnRendered_Lcom_scichart_charting_visuals_ISciPieChartSurface_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceRenderedListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.ISciPieChartSurfaceRenderedListenerImplementor, SciChart.Android.Charting", ISciPieChartSurfaceRenderedListenerImplementor.class, __md_methods);
	}


	public ISciPieChartSurfaceRenderedListenerImplementor ()
	{
		super ();
		if (getClass () == ISciPieChartSurfaceRenderedListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.ISciPieChartSurfaceRenderedListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onRendered (com.scichart.charting.visuals.ISciPieChartSurface p0)
	{
		n_onRendered (p0);
	}

	private native void n_onRendered (com.scichart.charting.visuals.ISciPieChartSurface p0);

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

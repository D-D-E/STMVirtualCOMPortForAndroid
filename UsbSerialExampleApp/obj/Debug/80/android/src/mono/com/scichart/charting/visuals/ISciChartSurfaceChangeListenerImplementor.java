package mono.com.scichart.charting.visuals;


public class ISciChartSurfaceChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.ISciChartSurfaceChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationsCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnAnnotationsCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onAnnotationsDrasticallyChanged:(Lcom/scichart/charting/visuals/ISciChartSurface;)V:GetOnAnnotationsDrasticallyChanged_Lcom_scichart_charting_visuals_ISciChartSurface_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onParentSurfaceResized:(Lcom/scichart/charting/utility/ResizedMessage;)V:GetOnParentSurfaceResized_Lcom_scichart_charting_utility_ResizedMessage_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onRenderSurfaceRendered:(Lcom/scichart/charting/visuals/rendering/RenderedMessage;)V:GetOnRenderSurfaceRendered_Lcom_scichart_charting_visuals_rendering_RenderedMessage_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onRenderableSeriesCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnRenderableSeriesCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onRenderableSeriesDrasticallyChanged:(Lcom/scichart/charting/visuals/ISciChartSurface;)V:GetOnRenderableSeriesDrasticallyChanged_Lcom_scichart_charting_visuals_ISciChartSurface_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onSelectedSeriesCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnSelectedSeriesCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onXAxesCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnXAxesCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onXAxesDrasticallyChanged:(Lcom/scichart/charting/visuals/ISciChartSurface;)V:GetOnXAxesDrasticallyChanged_Lcom_scichart_charting_visuals_ISciChartSurface_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onYAxesCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnYAxesCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onYAxesDrasticallyChanged:(Lcom/scichart/charting/visuals/ISciChartSurface;)V:GetOnYAxesDrasticallyChanged_Lcom_scichart_charting_visuals_ISciChartSurface_Handler:SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerImplementor, SciChart.Android.Charting", ISciChartSurfaceChangeListenerImplementor.class, __md_methods);
	}


	public ISciChartSurfaceChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ISciChartSurfaceChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.ISciChartSurfaceChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationsCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onAnnotationsCollectionChanged (p0);
	}

	private native void n_onAnnotationsCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onAnnotationsDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0)
	{
		n_onAnnotationsDrasticallyChanged (p0);
	}

	private native void n_onAnnotationsDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0);


	public void onParentSurfaceResized (com.scichart.charting.utility.ResizedMessage p0)
	{
		n_onParentSurfaceResized (p0);
	}

	private native void n_onParentSurfaceResized (com.scichart.charting.utility.ResizedMessage p0);


	public void onRenderSurfaceRendered (com.scichart.charting.visuals.rendering.RenderedMessage p0)
	{
		n_onRenderSurfaceRendered (p0);
	}

	private native void n_onRenderSurfaceRendered (com.scichart.charting.visuals.rendering.RenderedMessage p0);


	public void onRenderableSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onRenderableSeriesCollectionChanged (p0);
	}

	private native void n_onRenderableSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onRenderableSeriesDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0)
	{
		n_onRenderableSeriesDrasticallyChanged (p0);
	}

	private native void n_onRenderableSeriesDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0);


	public void onSelectedSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onSelectedSeriesCollectionChanged (p0);
	}

	private native void n_onSelectedSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onXAxesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onXAxesCollectionChanged (p0);
	}

	private native void n_onXAxesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onXAxesDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0)
	{
		n_onXAxesDrasticallyChanged (p0);
	}

	private native void n_onXAxesDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0);


	public void onYAxesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onYAxesCollectionChanged (p0);
	}

	private native void n_onYAxesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onYAxesDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0)
	{
		n_onYAxesDrasticallyChanged (p0);
	}

	private native void n_onYAxesDrasticallyChanged (com.scichart.charting.visuals.ISciChartSurface p0);

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

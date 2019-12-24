package mono.com.scichart.charting.visuals;


public class ISciPieChartSurfaceChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.ISciPieChartSurfaceChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onParentPieSurfaceResized:(Lcom/scichart/charting/utility/ResizedMessage;)V:GetOnParentPieSurfaceResized_Lcom_scichart_charting_utility_ResizedMessage_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onPieRenderSurfaceRendered:(Lcom/scichart/charting/visuals/PieChartRenderedMessage;)V:GetOnPieRenderSurfaceRendered_Lcom_scichart_charting_visuals_PieChartRenderedMessage_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onPieRenderableSeriesCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnPieRenderableSeriesCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onPieRenderableSeriesDrasticallyChanged:(Lcom/scichart/charting/visuals/ISciPieChartSurface;)V:GetOnPieRenderableSeriesDrasticallyChanged_Lcom_scichart_charting_visuals_ISciPieChartSurface_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onSegmentCollectionDrasticallyChanged:(Lcom/scichart/charting/visuals/renderableSeries/IPieRenderableSeries;)V:GetOnSegmentCollectionDrasticallyChanged_Lcom_scichart_charting_visuals_renderableSeries_IPieRenderableSeries_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onSegmentsCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnSegmentsCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onSelectedPieSeriesCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnSelectedPieSeriesCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onSelectedSegmentsCollectionChanged:(Lcom/scichart/core/observable/CollectionChangedEventArgs;)V:GetOnSelectedSegmentsCollectionChanged_Lcom_scichart_core_observable_CollectionChangedEventArgs_Handler:SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerImplementor, SciChart.Android.Charting", ISciPieChartSurfaceChangeListenerImplementor.class, __md_methods);
	}


	public ISciPieChartSurfaceChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ISciPieChartSurfaceChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.ISciPieChartSurfaceChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onParentPieSurfaceResized (com.scichart.charting.utility.ResizedMessage p0)
	{
		n_onParentPieSurfaceResized (p0);
	}

	private native void n_onParentPieSurfaceResized (com.scichart.charting.utility.ResizedMessage p0);


	public void onPieRenderSurfaceRendered (com.scichart.charting.visuals.PieChartRenderedMessage p0)
	{
		n_onPieRenderSurfaceRendered (p0);
	}

	private native void n_onPieRenderSurfaceRendered (com.scichart.charting.visuals.PieChartRenderedMessage p0);


	public void onPieRenderableSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onPieRenderableSeriesCollectionChanged (p0);
	}

	private native void n_onPieRenderableSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onPieRenderableSeriesDrasticallyChanged (com.scichart.charting.visuals.ISciPieChartSurface p0)
	{
		n_onPieRenderableSeriesDrasticallyChanged (p0);
	}

	private native void n_onPieRenderableSeriesDrasticallyChanged (com.scichart.charting.visuals.ISciPieChartSurface p0);


	public void onSegmentCollectionDrasticallyChanged (com.scichart.charting.visuals.renderableSeries.IPieRenderableSeries p0)
	{
		n_onSegmentCollectionDrasticallyChanged (p0);
	}

	private native void n_onSegmentCollectionDrasticallyChanged (com.scichart.charting.visuals.renderableSeries.IPieRenderableSeries p0);


	public void onSegmentsCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onSegmentsCollectionChanged (p0);
	}

	private native void n_onSegmentsCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onSelectedPieSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onSelectedPieSeriesCollectionChanged (p0);
	}

	private native void n_onSelectedPieSeriesCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);


	public void onSelectedSegmentsCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0)
	{
		n_onSelectedSegmentsCollectionChanged (p0);
	}

	private native void n_onSelectedSegmentsCollectionChanged (com.scichart.core.observable.CollectionChangedEventArgs p0);

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

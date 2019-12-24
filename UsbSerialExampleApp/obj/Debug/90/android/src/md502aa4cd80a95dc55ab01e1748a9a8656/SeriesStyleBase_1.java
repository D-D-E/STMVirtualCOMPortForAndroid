package md502aa4cd80a95dc55ab01e1748a9a8656;


public abstract class SeriesStyleBase_1
	extends com.scichart.charting.visuals.renderableSeries.SeriesStyleBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_applyStyleInternal:(Lcom/scichart/core/framework/ISuspendable;)V:GetApplyStyleInternal_Lcom_scichart_core_framework_ISuspendable_Handler\n" +
			"n_discardStyleInternal:(Lcom/scichart/core/framework/ISuspendable;)V:GetDiscardStyleInternal_Lcom_scichart_core_framework_ISuspendable_Handler\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.RenderableSeries.SeriesStyleBase`1, SciChart.Android.Charting", SeriesStyleBase_1.class, __md_methods);
	}


	public SeriesStyleBase_1 (java.lang.Class p0)
	{
		super (p0);
		if (getClass () == SeriesStyleBase_1.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.RenderableSeries.SeriesStyleBase`1, SciChart.Android.Charting", "Java.Lang.Class, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void applyStyleInternal (com.scichart.core.framework.ISuspendable p0)
	{
		n_applyStyleInternal (p0);
	}

	private native void n_applyStyleInternal (com.scichart.core.framework.ISuspendable p0);


	public void discardStyleInternal (com.scichart.core.framework.ISuspendable p0)
	{
		n_discardStyleInternal (p0);
	}

	private native void n_discardStyleInternal (com.scichart.core.framework.ISuspendable p0);

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

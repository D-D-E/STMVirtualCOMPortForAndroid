package md5cfba03e1af37202374404fc1fbe460de;


public abstract class PaletteProviderBase_1
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.renderableSeries.paletteProviders.IPaletteProvider,
		com.scichart.core.framework.IAttachable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_update:()V:GetUpdateHandler:SciChart.Charting.Visuals.RenderableSeries.PaletteProviders.IPaletteProviderInvoker, SciChart.Android.Charting\n" +
			"n_isAttached:()Z:GetIsAttachedHandler:SciChart.Core.Framework.IAttachableInvoker, SciChart.Android.Core\n" +
			"n_attachTo:(Lcom/scichart/core/IServiceContainer;)V:GetAttachTo_Lcom_scichart_core_IServiceContainer_Handler:SciChart.Core.Framework.IAttachableInvoker, SciChart.Android.Core\n" +
			"n_detach:()V:GetDetachHandler:SciChart.Core.Framework.IAttachableInvoker, SciChart.Android.Core\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.RenderableSeries.PaletteProviders.PaletteProviderBase`1, SciChart.Android.Charting", PaletteProviderBase_1.class, __md_methods);
	}


	public PaletteProviderBase_1 ()
	{
		super ();
		if (getClass () == PaletteProviderBase_1.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.RenderableSeries.PaletteProviders.PaletteProviderBase`1, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void update ()
	{
		n_update ();
	}

	private native void n_update ();


	public boolean isAttached ()
	{
		return n_isAttached ();
	}

	private native boolean n_isAttached ();


	public void attachTo (com.scichart.core.IServiceContainer p0)
	{
		n_attachTo (p0);
	}

	private native void n_attachTo (com.scichart.core.IServiceContainer p0);


	public void detach ()
	{
		n_detach ();
	}

	private native void n_detach ();

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

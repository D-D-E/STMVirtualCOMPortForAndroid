package mono.com.scichart.charting.visuals.rendering;


public class IRenderSurfaceChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.rendering.IRenderSurfaceChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRenderSurfaceChanged:()V:GetOnRenderSurfaceChangedHandler:SciChart.Charting.Visuals.Rendering.IRenderSurfaceChangedListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.Rendering.IRenderSurfaceChangedListenerImplementor, SciChart.Android.Charting", IRenderSurfaceChangedListenerImplementor.class, __md_methods);
	}


	public IRenderSurfaceChangedListenerImplementor ()
	{
		super ();
		if (getClass () == IRenderSurfaceChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.Rendering.IRenderSurfaceChangedListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onRenderSurfaceChanged ()
	{
		n_onRenderSurfaceChanged ();
	}

	private native void n_onRenderSurfaceChanged ();

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

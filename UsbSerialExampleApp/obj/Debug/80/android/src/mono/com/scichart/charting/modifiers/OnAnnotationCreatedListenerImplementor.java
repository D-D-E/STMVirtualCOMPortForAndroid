package mono.com.scichart.charting.modifiers;


public class OnAnnotationCreatedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.modifiers.OnAnnotationCreatedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnotationCreated:(Lcom/scichart/charting/visuals/annotations/IAnnotation;)V:GetOnAnnotationCreated_Lcom_scichart_charting_visuals_annotations_IAnnotation_Handler:SciChart.Charting.Modifiers.IOnAnnotationCreatedListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Modifiers.IOnAnnotationCreatedListenerImplementor, SciChart.Android.Charting", OnAnnotationCreatedListenerImplementor.class, __md_methods);
	}


	public OnAnnotationCreatedListenerImplementor ()
	{
		super ();
		if (getClass () == OnAnnotationCreatedListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Modifiers.IOnAnnotationCreatedListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onAnnotationCreated (com.scichart.charting.visuals.annotations.IAnnotation p0)
	{
		n_onAnnotationCreated (p0);
	}

	private native void n_onAnnotationCreated (com.scichart.charting.visuals.annotations.IAnnotation p0);

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

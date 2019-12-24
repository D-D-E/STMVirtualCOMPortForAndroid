package mono.com.scichart.charting.visuals.annotations;


public class OnAnnotationIsHiddenChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.annotations.OnAnnotationIsHiddenChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onIsHiddenChanged:(Lcom/scichart/charting/visuals/annotations/IAnnotation;)V:GetOnIsHiddenChanged_Lcom_scichart_charting_visuals_annotations_IAnnotation_Handler:SciChart.Charting.Visuals.Annotations.IOnAnnotationIsHiddenChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.Annotations.IOnAnnotationIsHiddenChangeListenerImplementor, SciChart.Android.Charting", OnAnnotationIsHiddenChangeListenerImplementor.class, __md_methods);
	}


	public OnAnnotationIsHiddenChangeListenerImplementor ()
	{
		super ();
		if (getClass () == OnAnnotationIsHiddenChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.Annotations.IOnAnnotationIsHiddenChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onIsHiddenChanged (com.scichart.charting.visuals.annotations.IAnnotation p0)
	{
		n_onIsHiddenChanged (p0);
	}

	private native void n_onIsHiddenChanged (com.scichart.charting.visuals.annotations.IAnnotation p0);

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

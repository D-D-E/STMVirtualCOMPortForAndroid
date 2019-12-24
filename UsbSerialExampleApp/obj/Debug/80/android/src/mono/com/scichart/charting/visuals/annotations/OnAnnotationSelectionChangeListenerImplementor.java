package mono.com.scichart.charting.visuals.annotations;


public class OnAnnotationSelectionChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.annotations.OnAnnotationSelectionChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelected:(Lcom/scichart/charting/visuals/annotations/IAnnotation;)V:GetOnSelected_Lcom_scichart_charting_visuals_annotations_IAnnotation_Handler:SciChart.Charting.Visuals.Annotations.IOnAnnotationSelectionChangeListenerInvoker, SciChart.Android.Charting\n" +
			"n_onUnselected:(Lcom/scichart/charting/visuals/annotations/IAnnotation;)V:GetOnUnselected_Lcom_scichart_charting_visuals_annotations_IAnnotation_Handler:SciChart.Charting.Visuals.Annotations.IOnAnnotationSelectionChangeListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.Annotations.IOnAnnotationSelectionChangeListenerImplementor, SciChart.Android.Charting", OnAnnotationSelectionChangeListenerImplementor.class, __md_methods);
	}


	public OnAnnotationSelectionChangeListenerImplementor ()
	{
		super ();
		if (getClass () == OnAnnotationSelectionChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.Annotations.IOnAnnotationSelectionChangeListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onSelected (com.scichart.charting.visuals.annotations.IAnnotation p0)
	{
		n_onSelected (p0);
	}

	private native void n_onSelected (com.scichart.charting.visuals.annotations.IAnnotation p0);


	public void onUnselected (com.scichart.charting.visuals.annotations.IAnnotation p0)
	{
		n_onUnselected (p0);
	}

	private native void n_onUnselected (com.scichart.charting.visuals.annotations.IAnnotation p0);

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

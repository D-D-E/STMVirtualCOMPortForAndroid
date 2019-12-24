package mono.com.scichart.charting.visuals.annotations;


public class OnAnnotationDragListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.visuals.annotations.OnAnnotationDragListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDragDelta:(Lcom/scichart/charting/visuals/annotations/IAnnotation;FF)V:GetOnDragDelta_Lcom_scichart_charting_visuals_annotations_IAnnotation_FFHandler:SciChart.Charting.Visuals.Annotations.IOnAnnotationDragListenerInvoker, SciChart.Android.Charting\n" +
			"n_onDragEnded:(Lcom/scichart/charting/visuals/annotations/IAnnotation;)V:GetOnDragEnded_Lcom_scichart_charting_visuals_annotations_IAnnotation_Handler:SciChart.Charting.Visuals.Annotations.IOnAnnotationDragListenerInvoker, SciChart.Android.Charting\n" +
			"n_onDragStarted:(Lcom/scichart/charting/visuals/annotations/IAnnotation;)V:GetOnDragStarted_Lcom_scichart_charting_visuals_annotations_IAnnotation_Handler:SciChart.Charting.Visuals.Annotations.IOnAnnotationDragListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.Visuals.Annotations.IOnAnnotationDragListenerImplementor, SciChart.Android.Charting", OnAnnotationDragListenerImplementor.class, __md_methods);
	}


	public OnAnnotationDragListenerImplementor ()
	{
		super ();
		if (getClass () == OnAnnotationDragListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Visuals.Annotations.IOnAnnotationDragListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onDragDelta (com.scichart.charting.visuals.annotations.IAnnotation p0, float p1, float p2)
	{
		n_onDragDelta (p0, p1, p2);
	}

	private native void n_onDragDelta (com.scichart.charting.visuals.annotations.IAnnotation p0, float p1, float p2);


	public void onDragEnded (com.scichart.charting.visuals.annotations.IAnnotation p0)
	{
		n_onDragEnded (p0);
	}

	private native void n_onDragEnded (com.scichart.charting.visuals.annotations.IAnnotation p0);


	public void onDragStarted (com.scichart.charting.visuals.annotations.IAnnotation p0)
	{
		n_onDragStarted (p0);
	}

	private native void n_onDragStarted (com.scichart.charting.visuals.annotations.IAnnotation p0);

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

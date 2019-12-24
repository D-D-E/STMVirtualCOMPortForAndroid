package mono.com.scichart.charting.layoutManagers;


public class ILayoutManagerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.layoutManagers.ILayoutManagerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAxisAlignmentChanged:(Lcom/scichart/charting/visuals/axes/IAxis;Lcom/scichart/charting/visuals/axes/AxisAlignment;Lcom/scichart/charting/visuals/axes/AxisAlignment;)V:GetOnAxisAlignmentChanged_Lcom_scichart_charting_visuals_axes_IAxis_Lcom_scichart_charting_visuals_axes_AxisAlignment_Lcom_scichart_charting_visuals_axes_AxisAlignment_Handler:SciChart.Charting.LayoutManagers.ILayoutManagerListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.LayoutManagers.ILayoutManagerListenerImplementor, SciChart.Android.Charting", ILayoutManagerListenerImplementor.class, __md_methods);
	}


	public ILayoutManagerListenerImplementor ()
	{
		super ();
		if (getClass () == ILayoutManagerListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.LayoutManagers.ILayoutManagerListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onAxisAlignmentChanged (com.scichart.charting.visuals.axes.IAxis p0, com.scichart.charting.visuals.axes.AxisAlignment p1, com.scichart.charting.visuals.axes.AxisAlignment p2)
	{
		n_onAxisAlignmentChanged (p0, p1, p2);
	}

	private native void n_onAxisAlignmentChanged (com.scichart.charting.visuals.axes.IAxis p0, com.scichart.charting.visuals.axes.AxisAlignment p1, com.scichart.charting.visuals.axes.AxisAlignment p2);

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

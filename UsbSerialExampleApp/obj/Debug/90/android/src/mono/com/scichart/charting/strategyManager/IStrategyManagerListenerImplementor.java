package mono.com.scichart.charting.strategyManager;


public class IStrategyManagerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.charting.strategyManager.IStrategyManagerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStrategyManagerChanged:(Lcom/scichart/charting/strategyManager/IStrategyManager;)V:GetOnStrategyManagerChanged_Lcom_scichart_charting_strategyManager_IStrategyManager_Handler:SciChart.Charting.StrategyManager.IStrategyManagerListenerInvoker, SciChart.Android.Charting\n" +
			"";
		mono.android.Runtime.register ("SciChart.Charting.StrategyManager.IStrategyManagerListenerImplementor, SciChart.Android.Charting", IStrategyManagerListenerImplementor.class, __md_methods);
	}


	public IStrategyManagerListenerImplementor ()
	{
		super ();
		if (getClass () == IStrategyManagerListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.StrategyManager.IStrategyManagerListenerImplementor, SciChart.Android.Charting", "", this, new java.lang.Object[] {  });
	}


	public void onStrategyManagerChanged (com.scichart.charting.strategyManager.IStrategyManager p0)
	{
		n_onStrategyManagerChanged (p0);
	}

	private native void n_onStrategyManagerChanged (com.scichart.charting.strategyManager.IStrategyManager p0);

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

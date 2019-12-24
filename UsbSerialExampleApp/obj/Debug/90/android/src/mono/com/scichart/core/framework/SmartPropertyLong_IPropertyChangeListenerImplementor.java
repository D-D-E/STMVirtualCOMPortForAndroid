package mono.com.scichart.core.framework;


public class SmartPropertyLong_IPropertyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.core.framework.SmartPropertyLong.IPropertyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPropertyChanged:(JJ)V:GetOnPropertyChanged_JJHandler:SciChart.Core.Framework.SmartPropertyLong/IPropertyChangeListenerInvoker, SciChart.Android.Core\n" +
			"";
		mono.android.Runtime.register ("SciChart.Core.Framework.SmartPropertyLong+IPropertyChangeListenerImplementor, SciChart.Android.Core", SmartPropertyLong_IPropertyChangeListenerImplementor.class, __md_methods);
	}


	public SmartPropertyLong_IPropertyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SmartPropertyLong_IPropertyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Core.Framework.SmartPropertyLong+IPropertyChangeListenerImplementor, SciChart.Android.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPropertyChanged (long p0, long p1)
	{
		n_onPropertyChanged (p0, p1);
	}

	private native void n_onPropertyChanged (long p0, long p1);

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

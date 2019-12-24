package mono.com.scichart.core.framework;


public class SmartPropertyDouble_IPropertyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.core.framework.SmartPropertyDouble.IPropertyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPropertyChanged:(DD)V:GetOnPropertyChanged_DDHandler:SciChart.Core.Framework.SmartPropertyDouble/IPropertyChangeListenerInvoker, SciChart.Android.Core\n" +
			"";
		mono.android.Runtime.register ("SciChart.Core.Framework.SmartPropertyDouble+IPropertyChangeListenerImplementor, SciChart.Android.Core", SmartPropertyDouble_IPropertyChangeListenerImplementor.class, __md_methods);
	}


	public SmartPropertyDouble_IPropertyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SmartPropertyDouble_IPropertyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Core.Framework.SmartPropertyDouble+IPropertyChangeListenerImplementor, SciChart.Android.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPropertyChanged (double p0, double p1)
	{
		n_onPropertyChanged (p0, p1);
	}

	private native void n_onPropertyChanged (double p0, double p1);

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

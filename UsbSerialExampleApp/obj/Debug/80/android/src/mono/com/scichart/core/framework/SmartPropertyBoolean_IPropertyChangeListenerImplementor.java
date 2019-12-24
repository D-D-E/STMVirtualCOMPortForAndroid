package mono.com.scichart.core.framework;


public class SmartPropertyBoolean_IPropertyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.core.framework.SmartPropertyBoolean.IPropertyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPropertyChanged:(ZZ)V:GetOnPropertyChanged_ZZHandler:SciChart.Core.Framework.SmartPropertyBoolean/IPropertyChangeListenerInvoker, SciChart.Android.Core\n" +
			"";
		mono.android.Runtime.register ("SciChart.Core.Framework.SmartPropertyBoolean+IPropertyChangeListenerImplementor, SciChart.Android.Core", SmartPropertyBoolean_IPropertyChangeListenerImplementor.class, __md_methods);
	}


	public SmartPropertyBoolean_IPropertyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SmartPropertyBoolean_IPropertyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Core.Framework.SmartPropertyBoolean+IPropertyChangeListenerImplementor, SciChart.Android.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPropertyChanged (boolean p0, boolean p1)
	{
		n_onPropertyChanged (p0, p1);
	}

	private native void n_onPropertyChanged (boolean p0, boolean p1);

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

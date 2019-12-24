package mono.com.scichart.core.framework;


public class SmartPropertyInteger_IPropertyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.core.framework.SmartPropertyInteger.IPropertyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPropertyChanged:(II)V:GetOnPropertyChanged_IIHandler:SciChart.Core.Framework.SmartPropertyInteger/IPropertyChangeListenerInvoker, SciChart.Android.Core\n" +
			"";
		mono.android.Runtime.register ("SciChart.Core.Framework.SmartPropertyInteger+IPropertyChangeListenerImplementor, SciChart.Android.Core", SmartPropertyInteger_IPropertyChangeListenerImplementor.class, __md_methods);
	}


	public SmartPropertyInteger_IPropertyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SmartPropertyInteger_IPropertyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Core.Framework.SmartPropertyInteger+IPropertyChangeListenerImplementor, SciChart.Android.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPropertyChanged (int p0, int p1)
	{
		n_onPropertyChanged (p0, p1);
	}

	private native void n_onPropertyChanged (int p0, int p1);

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

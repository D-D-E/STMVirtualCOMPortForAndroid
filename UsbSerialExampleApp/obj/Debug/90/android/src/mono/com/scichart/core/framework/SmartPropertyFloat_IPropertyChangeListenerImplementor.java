package mono.com.scichart.core.framework;


public class SmartPropertyFloat_IPropertyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.core.framework.SmartPropertyFloat.IPropertyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPropertyChanged:(FF)V:GetOnPropertyChanged_FFHandler:SciChart.Core.Framework.SmartPropertyFloat/IPropertyChangeListenerInvoker, SciChart.Android.Core\n" +
			"";
		mono.android.Runtime.register ("SciChart.Core.Framework.SmartPropertyFloat+IPropertyChangeListenerImplementor, SciChart.Android.Core", SmartPropertyFloat_IPropertyChangeListenerImplementor.class, __md_methods);
	}


	public SmartPropertyFloat_IPropertyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SmartPropertyFloat_IPropertyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Core.Framework.SmartPropertyFloat+IPropertyChangeListenerImplementor, SciChart.Android.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPropertyChanged (float p0, float p1)
	{
		n_onPropertyChanged (p0, p1);
	}

	private native void n_onPropertyChanged (float p0, float p1);

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

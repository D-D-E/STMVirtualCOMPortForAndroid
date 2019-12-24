package mono.com.scichart.core.framework;


public class SmartProperty_IPropertyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.scichart.core.framework.SmartProperty.IPropertyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPropertyChanged:(Ljava/lang/Object;Ljava/lang/Object;)V:GetOnPropertyChanged_Ljava_lang_Object_Ljava_lang_Object_Handler:SciChart.Core.Framework.SmartProperty/IPropertyChangeListenerInvoker, SciChart.Android.Core\n" +
			"";
		mono.android.Runtime.register ("SciChart.Core.Framework.SmartProperty+IPropertyChangeListenerImplementor, SciChart.Android.Core", SmartProperty_IPropertyChangeListenerImplementor.class, __md_methods);
	}


	public SmartProperty_IPropertyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == SmartProperty_IPropertyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("SciChart.Core.Framework.SmartProperty+IPropertyChangeListenerImplementor, SciChart.Android.Core", "", this, new java.lang.Object[] {  });
	}


	public void onPropertyChanged (java.lang.Object p0, java.lang.Object p1)
	{
		n_onPropertyChanged (p0, p1);
	}

	private native void n_onPropertyChanged (java.lang.Object p0, java.lang.Object p1);

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

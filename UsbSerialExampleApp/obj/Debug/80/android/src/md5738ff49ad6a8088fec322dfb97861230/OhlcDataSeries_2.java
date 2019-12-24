package md5738ff49ad6a8088fec322dfb97861230;


public class OhlcDataSeries_2
	extends com.scichart.charting.model.dataSeries.OhlcDataSeries
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("SciChart.Charting.Model.DataSeries.OhlcDataSeries`2, SciChart.Android.Charting", OhlcDataSeries_2.class, __md_methods);
	}


	public OhlcDataSeries_2 (java.lang.Class p0, java.lang.Class p1)
	{
		super (p0, p1);
		if (getClass () == OhlcDataSeries_2.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Model.DataSeries.OhlcDataSeries`2, SciChart.Android.Charting", "Java.Lang.Class, Mono.Android:Java.Lang.Class, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public OhlcDataSeries_2 (java.lang.Class p0, java.lang.Class p1, com.scichart.charting.model.datadistributioncalculator.IDataDistributionCalculator p2)
	{
		super (p0, p1, p2);
		if (getClass () == OhlcDataSeries_2.class)
			mono.android.TypeManager.Activate ("SciChart.Charting.Model.DataSeries.OhlcDataSeries`2, SciChart.Android.Charting", "Java.Lang.Class, Mono.Android:Java.Lang.Class, Mono.Android:SciChart.Charting.Model.DataDistributionCalculator.IDataDistributionCalculator, SciChart.Android.Charting", this, new java.lang.Object[] { p0, p1, p2 });
	}

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

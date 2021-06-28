
public class APseriesGPseries {

	public static void APSeries(int a,int b,int n)
	{
		//a+(n-1)d
		int d=b-a;
		int result=a+(n-1)*d;
		System.out.println(result);
	}
	public static void GPSeries(int a,int b,int n)
	{
	double ratio=b/a;
	double result=a*Math.pow(ratio, n-1);
	System.out.println(result);
	}
	public static void SumOfFirstNnumberINAPSeries(int a,int b,int n)
	{
		int d=b-a;
		int result=0;
		
		for(int i=0;i<n;i++)
		{
			result=result+a;
			a=a+d;
		}
		
		
		System.out.println(result);
		
	}
	
	public static void SumOfFirstNnumberINGPSeries(int a,int b,int n)
	{
		double result=0;
		int r=b/a;
		for(int i=0;i<n;i++)
		{
			result=result+a;
			a=a*r;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APSeries(2, 4, 7);
		SumOfFirstNnumberINAPSeries(2, 4, 7);
		GPSeries(1, 3, 8);
		SumOfFirstNnumberINGPSeries(1, 3, 7);
		
		
		

	}

}

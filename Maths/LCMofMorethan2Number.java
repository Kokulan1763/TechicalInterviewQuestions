
public class LCMofMorethan2Number {
	public  static int gcd(int a,int b)
	{
		
		if(a==0)
		return b;
		else
			return gcd(b%a,a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a={12,15,10,75};
		for(int i=0;i<a.length-1;i++)
		{
			a[i+1]=a[i]*a[i+1]/gcd(a[i],a[i+1]);
		}
		System.out.println(a[a.length-1]);
		
		
	}

}

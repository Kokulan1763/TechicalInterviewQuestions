
public class GCDofMoreThan2Numbers {

	public  static int gcd(int a,int b)
	{
		
		if(a==0)
		return b;
		else
			return gcd(b%a,a);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={20, 50, 120};
		//gcd of any number with 1 is 1
		int result=0;
		
		for(int elem:a)
		{
			result=gcd(result,elem);
			
			
			
			
		}
		System.out.println(result);

	}

}

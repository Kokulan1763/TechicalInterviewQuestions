
public class LCMofTwoNumber {
	public  static int gcd(int a,int b)
	{
		
		if(a==0)
		return b;
		else
			return gcd(b%a,a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//product of two number=lcm*gcf
		//lcm=(a*b)/gcf
		
		int a=10;
		int b=20;
		int lcm=(a*b)/gcd(a,b);
		System.out.println(lcm);
		
		

	}

}

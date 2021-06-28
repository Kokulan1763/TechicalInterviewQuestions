
public class ArmStrongNumber {

	public static void result(int n)
	{
		//Count the number of digit in given number
		int size=(int) (Math.ceil(Math.log10(n)));
		//System.out.println(size);
		int sum=0;
		int a=n;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+(int)Math.pow(rem,size);
			a=a/10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
		
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
result(1634);
	}

}

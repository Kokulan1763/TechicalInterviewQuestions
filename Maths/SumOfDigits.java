
public class SumOfDigits {
	public static void result(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+(n%10);
			n/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		result(12345);

	}

}

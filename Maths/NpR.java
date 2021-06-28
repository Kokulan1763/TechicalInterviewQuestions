
public class NpR {
	
	public static int factorial(int n)
	{
		if(n==0)return 1;
		else
		return	n*factorial(n-1);
	}
	
	public static void result(int n,int r)
	{
		//npr=n!/(n-r)!
		int a=factorial(n);
		int b=factorial(n-r);
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result(10,8);

	}

}

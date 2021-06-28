

//Input:32
//Output:32+23=55<==>55(palindrome)
//Input:59
//output:59+95=154<==>451(Not a Plaindrome)




public class PalindromeSum {
	
	public static int plain(int n)
	{
		int a=n;
		int reverse=0;
		while(a>0)
		{
			reverse=reverse*10+(a%10);
			a/=10;
		}
		return reverse;
	}
	public static void result(int n)
	{
		
		int result=n+plain(n);
		int finalResult=plain(result);
		if(result==finalResult)
			System.out.println("palINDROME");
		else
			System.out.println("Not Palindrome");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result(32);
		result(59);

	}

}

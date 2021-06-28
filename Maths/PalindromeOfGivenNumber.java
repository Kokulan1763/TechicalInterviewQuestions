
public class PalindromeOfGivenNumber {
	public static void result(int n)
	{
		int reverse=0;
		while(n>0)
		{
			reverse=reverse*10+(n%10);
			n/=10;
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
result(68989);
	}

}

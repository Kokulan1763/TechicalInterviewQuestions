import java.util.Scanner;

//n!=100!
//log(n!)=log(100!)=log(1*2*...100)
//log(1)*log(2)....log(100)
//



public class NumberOfDigitsInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double d=0;
		for(int i=1;i<=n;i++)
		{
			d=d+Math.log10(i);
			
			
		}
		System.out.println(Math.ceil(d));
	}

}

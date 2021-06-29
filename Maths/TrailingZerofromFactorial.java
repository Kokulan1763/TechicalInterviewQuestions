import java.util.Scanner;


//Input:5
//output:1
//Input:100
//output:24
//100! having 24 zeros at end






public class TrailingZerofromFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int divisor=5,sum=0;
		while((n/divisor)>0)
		{
			sum=sum+(n/divisor);
			divisor*=5;
		}
		System.out.println(sum);
		
	}

}

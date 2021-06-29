import java.util.Scanner;

//Input:49
//Output:4 9 25 49
//the number with in 49 having exactly three divisor
//eg: 9=> 1,3,9 are divisors


//Square of prime numbers



public class ExactlyThreeDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	for(int i=2;i<=n;i++)
	{
		int count=0;
		for(int j=2;j<=Math.sqrt(i);j++)
		{
			if(i%j==0)count++;
		}
		if(count==0)
		{
		    if(i*i<=n)System.out.print((i*i)+" ");
		}
		
	}
		
	}

}

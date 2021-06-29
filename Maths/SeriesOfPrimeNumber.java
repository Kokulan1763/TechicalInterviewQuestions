import java.util.Scanner;


public class SeriesOfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{int count=0;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					count++;
				}
				if(count>0)break;
				
			}
			if(count==0)System.out.print(i+" ");
		}

	}

}

import java.util.Scanner;


public class KthDigitFromApowerB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int res=(int)Math.pow(A, B);
		int Final=0;
		while(k-->0)
		
		{Final=res%10;
			res=res/10;
			
		}
		System.out.println(Final);
	}

}

import java.util.Scanner;


//input:m=13 n=4
//output:12
//input:m=-15 n=6
//output:-18
//Explanation:
//m=13     closest number divisible by 4==>12,16
//12 is most closest one.


public class ClosestToMDivisibleByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		
		int quotient=M/N;
		int firstNumber=quotient*N;
		//System.out.println(firstNumber);
		int secondNumber=0;
		if(M*N>0)
		{
			secondNumber=(quotient+1)*N;
		}
		else
		{
			secondNumber=(quotient-1)*N;
		}
		if(Math.abs(firstNumber-M)<Math.abs(secondNumber-M))
		{
			System.out.println(firstNumber);
		}
		else
		{
			System.out.println(secondNumber);
		}
	}

}

import java.util.Scanner;
//Ip:56
//output:49
//expalantion==>49 56 64

public class NearestPerfectSquare {

	public static Boolean isPerfectSquare(double num)
	{
		int temp=(int)Math.sqrt(num);
		if(temp*temp==num)
		{
			return true;
		}
		return false;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
	double num=sc.nextDouble();
	double smaller=0,larger=0;
	double temp=Math.sqrt(num);
//	System.out.println(temp);
	if(isPerfectSquare(num))
	{
		smaller=(temp-1);
		larger=((temp+1));
	}
	else
	{smaller=Math.floor((Math.sqrt(num)));
	larger=Math.ceil(((Math.sqrt(num))));
	
		
	}
	//System.out.println(smaller +"  "+larger);
	if(Math.abs(num-smaller*smaller)>Math.abs(larger*larger-num))
	{  
		System.out.println(larger*larger);
	}
	else
	{
		System.out.println(smaller*smaller);
	}
	
	
	
	}

}

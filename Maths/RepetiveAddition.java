import java.util.Scanner;
//input:98
//output:9+8=17=>1+7=8

public class RepetiveAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int a=num;
		while(a>9){
			int sum=0;
			num=a;
			while(num>0)
		{
			sum=sum+num%10;
			num/=10;
		}
			
		a=sum;
		}
		System.out.println(a);
		
		
	}

}

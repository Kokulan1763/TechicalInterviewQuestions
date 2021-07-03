import java.util.Scanner;


public class QuadraticEquation {

	
	
	//(-b+Sqrt(b^2-2ac))/2a
	//b^2-4ac  less than zero(imaginary root)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		int temp=(b*b)-4*a*c;
		if(temp<0)
		{
			System.out.println("Imaginary");
		}
		else
		{
			int root1=(int) ((-b+Math.sqrt(temp)))/(2*a);
			int root2=(int) ((-b-Math.sqrt(temp)))/(2*a);
			System.out.println(root1+"   "+root2);
		}
		
		
		
		
		
		
	}

}

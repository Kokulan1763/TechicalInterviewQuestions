import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int result=1;
		while(n>0)
		{
			result=result*n--;
		}
		System.out.println(result);
		///using RECURSION
	    //if(n==0)return 1; else return function(n-1)*n; 
		
	}

}

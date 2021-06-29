import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrimeNumberChecker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int count=0;
for(int i=2;i<=(int)Math.sqrt(n);i++)
{
	if(n%i==0)
	{
		count++;
	}
	if(count>=1)
	break;
}
if(count==0)System.out.println("Prime Number");
else
	System.out.print("Not a Prime");

	}

}

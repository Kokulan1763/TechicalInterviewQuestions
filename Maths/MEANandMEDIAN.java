import java.util.Arrays;


public class MEANandMEDIAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={1,2,3,10,5,9,7};
		int sum=0;
		for(int elem:a)
		{
			sum+=elem;
		}
		int mean=sum/a.length;
System.out.println("Mean    "+mean);
Arrays.sort(a);
System.out.println("Ascending Order:");
for(int elem:a)System.out.print(elem+" ");
System.out.println("MEdian   ");
	if(a.length%2==0)
	{
		System.out.print(a[a.length/2-1]+" "+a[(a.length/2)]);
	}
	else
	{
		System.out.print((a[a.length/2]));
	}
	
	
	}

}

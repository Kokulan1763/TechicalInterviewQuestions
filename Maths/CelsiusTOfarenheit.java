
public class CelsiusTOfarenheit {

	
	public static void CtoF(int c)
	{
		int f=(c*9/5)+32;
		System.out.println(f);
	}
	public static void FtoC(int f)
	{
		int c=(f-32)*5/9;
System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CtoF(100);
FtoC(212);
	}

}

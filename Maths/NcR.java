import java.math.BigInteger;


public class NcR {
	
	
	public static void result(int n,int r)
	{
		//ncr=n!/((n-r)!*r!)
		int nr=n-r;
		if(n>r)
		{
			
			BigInteger resultSet=new BigInteger("1");
			while(n>0)
			{
				resultSet=resultSet.multiply(BigInteger.valueOf(n--));
			}
			while(nr>0)
			{
				resultSet=resultSet.divide(BigInteger.valueOf(nr--));
				
			}
			while(r>0)
			{
				resultSet=resultSet.divide(BigInteger.valueOf(r--));
				
			}
			
			System.out.println(resultSet);
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
result(10,8);
	}

}

package casting;

public class Program3 
{
	public static void main(String[] args)
	{
	// explicit casting
		
		double a = 11.88;		// 8 byte
		
		System.out.println("double infromation-->"+a);
		
	// a--> double (8 byte)--> convert --> int (4 byte)
	//	a--> higher size --> lower size
		
		int b = (int)a;		// 4 byte
		
	System.out.println("Int info-->"+b);
		
	}

}

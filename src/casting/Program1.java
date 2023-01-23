package casting;

public class Program1
{
	public static void main(String[] args)
	{
		// case 1
		byte a = 100;
		System.out.println("Byte Info"+a);
		
		// a byte --> convert -> int -> store --> int
		int b = (int) a;		// 4 byte
		System.out.println("int info-->"+b);
		
		
		// case 2
		
		int c = 11;
		System.out.println("int info-->"+c);
		
		//int--> convert--> double---> store--> double
		
		double d = (double)c;   // 8 byte
		
	System.out.println("double info-->"+d);
		
		
		
	}

}

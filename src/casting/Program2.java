package casting;

public class Program2 
{
	public static void main(String[] args)
	{
	// program automatic implicit program
		
		byte a =10 ;   // 1 byte
		byte b = 20;   // 1 byte
		
	//	byte c = a+b;		// issue cant not convert from 
							// int to byte
		
	//	int c  = (int)(a+b);   // higher data type 4 byte
		
		int c = a+b;
		
		System.out.println(c);
				
	}

}

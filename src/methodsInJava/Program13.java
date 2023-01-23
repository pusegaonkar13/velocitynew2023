// how to use arguments in program

package methodsInJava;

public class Program13
{
// basic addtion method
//	case 1
	
	public static void additionmethod()
	{
		int a =10,b=20;
		int c = a+b;
		System.out.println(c);
		
	}
	
// case 2	
/*	public static void additionmethod(int x,int y)
	{
		int a = 10, b=20;
		int c = a + b;
		System.out.println(c);
		
	} */
	
// case 3
	
	public static void additionmethod(int x, int y)
	{
		int a = x;
		int b = y;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	
	{
	// case 1	
//		Program13.additionmethod();
	// case 2	
//		Program13.additionmethod(100, 200);
	// case 3
		Program13.additionmethod(10,25);
	}

}

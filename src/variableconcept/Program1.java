// global variable vs local variable

package variableconcept;

public class Program1 
{

//	non static ---> global variable
	int a = 100; // blue --- global variable
	
//	 static variable---> 
	
	static int m = 500;
	
//	create constructor
	
	public Program1()
	{
		int b = 200; // purple---> local variable
	}
	
//	create method
	public static void method1()
	{
		int d = 400; // purple---> local variable
	}
}

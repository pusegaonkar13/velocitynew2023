// calling global variables
package variableInjava;

public class Program2 
{
// non static global variable
	
	int a = 100;
	
// static variable
	
	static int b = 200; 
	
// create constructor 
	public Program2()
	{
		int c = 200;     // Local variable
		
		System.out.println("This is a consrtuctor --> "+c);
		
	}
	
// create method
	public static void method1()
	{
		int d = 400;      // Local variable
		System.out.println("This is a Method --> "+d);
	}
	
	public static void main(String[] args)
	{
	
		int e = 500;        // local variable
		System.out.println("This is Local variable --> "+e);
		
	// calling constructor 
		Program2 x = new Program2();
		
	// method calling 
		
		method1();
	
	
	}
		

}

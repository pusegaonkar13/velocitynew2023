// Global variable AND local Variable

package variableInjava;

public class Program1
{
	// non static variable
	
	int a = 100;       // blue color--> global variable
	
	
	// static global variable
	
	static int k =500;    // blue color--> global variable
	
	// In constructor 
	
	public Program1()
	{
		int b = 200;       /// color purple Local variable
		System.out.println("This is local variable in cosnt");
	}
	
	// In method
	public static void method1()
	{
		int c = 300;       // color purple Local variable
		System.out.println("This is Local variable in method1");
	}
	
	public static void main(String[] args)
	{
		int d = 400;    // color purple Local variable
		
		System.out.println("This is localvariable in main method");
		
		// calling method1
		method1();	
		
		Program1 x = new Program1();
	}
	

}




// constructor and non static  method

package constructorInJava;

public class Program3 
{
	int a;
	
	public Program3()    // create constructor
	{
		int a = 100;
		System.out.println(a);
		System.out.println("hi this is constructor");
	}
	
	// crate non static method
	
	public void method1()
	{
		System.out.println("This is non static method" );
	}
	
	// main method
	
	public static void main(String[] args)
	{
	// we need to create object 	
	// while creating object we atomatically calls the 
	// constructor
		
		Program3 prish = new Program3 ();
		{
			prish.method1();
			
		}
	
	}	
	
}

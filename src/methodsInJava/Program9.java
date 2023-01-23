package methodsInJava;

public class Program9 
{
// method without arguments
	
	public static void method1()
	{
		System.out.println("method 1-zero arguments");
		System.out.println("method1 - without arguments");
	}
	
// method with arguments
	
	public static void method2(char x)
	{
		System.out.println("method 2  with char arguments");
		
	}
// method with arguments
	
	public static void method3(int y)
	{
		System.out.println("method 3 with integer arguments");
	}
	
	// main method for calling
	public static void main(String[] args)
	{
//		method call directly 
		
//		method1();
		
//		method2('p');
		
//		method3(10);
		
// method call with help of class name
		
		Program9.method1();
		Program9.method2('p');  // pass char value in single Quotes
		Program9.method3(100);
		
		
		
	}

}

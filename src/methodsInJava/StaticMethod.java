package methodsInJava;

public class StaticMethod // class name

{

	//	Static Method
//	1. method with Static keyword
//	2. these are class method
//	3. these method can call directly or with help of class name

// program 1 basic progam for creating method
	
//	public static void prashant() method name
//	{
//		System.out.println("Hi prashant");
//		System.out.println("How are you prashant");
//		System.out.println("this is static method");
//
//	}
//	public static void main(String[] args)
//	
//	{
//		System.out.println(1);
//		prashant();
//		
//		System.out.println(2);
//		prashant();
//
//		
//	}
	
//	 program 2 - static method
	
	public static void additionmethod() // method 
	
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addiction of a and b is-->"+c);
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Directly call");
		additionmethod(); // calling directly
		
		System.out.println("with help of class name");
		StaticMethod.additionmethod();
		
		
		
		
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



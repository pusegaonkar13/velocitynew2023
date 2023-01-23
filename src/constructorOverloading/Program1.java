package constructorOverloading;

public class Program1 

{
	int a ;
	int b ;
	
// create one constructor without arguments
	
	public Program1()		/* if you not public keyword 
	 						 its not showing any error because 
	 						 its take default access modifier*/
	{
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		
	}
	public Program1(int x)
	{
		a = 100;
		b = 200;
		System.out.println(a);
		System.out.println(b);
		
	}
	public Program1(String x)
	{
		a = 1000;
		b = 2000;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		
	// ex.1
	
	Program1 x = new Program1();
	
	// ex.2
	
	Program1 y = new Program1(90);
	
	Program1 z = new Program1("Prashant");


	}
}
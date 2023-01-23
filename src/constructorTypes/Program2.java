package constructorTypes;


public class Program2 
// create constructor without arguments
{
	public  Program2()
	{
	int a = 10;
	int b =20;
	System.out.println("constructor without arguments");
	System.out.println(a);
	System.out.println(b);
	}
	
// constructor with arguments 
	
	public Program2(String z)
	{
	int x =100;
	int	y = 200;
		System.out.println("constructor with arguemtns");
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args)
	{
	// to call const 1 create object
		
		Program2 obj1 = new Program2();
		
	// to call cosnt 2 crete object
		
		Program2 obj2 = new Program2("Prashant")
;	}

}

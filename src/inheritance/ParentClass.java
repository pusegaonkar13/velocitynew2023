package inheritance;

public class ParentClass 
{
// non static variable Global variable
	int a = 100;
	
	public void method1()
	{
		System.out.println("Method1- parentClas-non static");
	}
	
	public static void main(String[] args)
	{
		// normal way calling elements
		
		ParentClass x = new ParentClass();
		System.out.println(x.a);
		x.method1();
		
	}
	
}

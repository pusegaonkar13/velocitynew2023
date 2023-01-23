package accessModifiers;

public class Class1 
{
	protected static int a = 100;
	protected int b = 200;
	
	protected static void method1()   // static method
	{
		System.out.println("-static - method- class1 pack AM");
	}
	protected void method2()     // non static method
	
	{
		System.out.println("-Non static - method2- class1 pack AM");
	}
	
	public static void main(String[] args)
	{
		System.out.println(a);
		method1();
		
		Class1 x = new Class1();
		System.out.println(x.b);
		x.method2();
		
		
	}

}

package accessModifiers;

public class Class2

{
	public static void main(String[] args)
	{
		// calling static element from ClassA
		System.out.println(Class1.a);
		Class1.method1();
		
		// calling non static element form ClassA
		
		Class1 x = new Class1();
		System.out.println(x.b);
		x.method2();
		
	
		
		
	}

}

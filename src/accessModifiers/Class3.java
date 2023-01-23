package accessModifiers;

import accessModifiers.Class1;

public class Class3
{
	
	public static void main(String[] args)
	{
		// calling static var & method from Class1
		System.out.println(Class1.a);
		Class1.method1();
		
		// calling Non static var & method from Class1
		
		Class1 x = new Class1();
		System.out.println(x.b);
		x.method2();
		
	}

}

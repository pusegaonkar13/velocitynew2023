package casting;

public class ChildClass extends ParentClass
{
	public void method3()
	{
		System.out.println("Method 3 --> child class");
	}
	
	public void method4()
	{
		System.out.println("Method 4--> child Class");
	}
	
	
	public static void main(String[] args)
	{
	// inheritance way	
		ChildClass x = new ChildClass();
		x.method1();		// parent--yes
		x.method2();		// parent--yes
		x.method3();		// child--yes
		x.method4();		// child--yes
		
	//	UpCasting way
		
		ParentClass z = new ChildClass();
		z.method1();	// parent-- yes
		z.method2();	// parent -- yes
		
//		z.method3();	// not possible
//		z.method4();	// not possible
	}

}












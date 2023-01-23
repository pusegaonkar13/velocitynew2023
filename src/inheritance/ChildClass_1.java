package inheritance;

public class ChildClass_1 extends ParentClass_1 

{
	
	public static void main(String[] args)
	{
		
	
	// 1 normal way of element calling
	// parent elements
	
	ParentClass_1 x = new ParentClass_1();
	System.out.println(x.a);
	x.method1();
	
	/*  Inheritance way of element calling 
	 *	properties are of --> parent class
	 *  who will be use them --> child 
	 *  create object of child class */
	
	ChildClass_1 z = new ChildClass_1();
	System.out.println(z.a);
	z.method1();

	}

}

package inheritance;

public class ChildClass extends ParentClass

{
	
	public static void main(String[] args)
	{
		ParentClass y = new ParentClass();
		System.out.println(y.a);
		y.method1();
		
		
		ChildClass z = new ChildClass();
		System.out.println(y.a);
		y.method1();
		
	}

}

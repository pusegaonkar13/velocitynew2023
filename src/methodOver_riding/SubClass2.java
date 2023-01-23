package methodOver_riding;

public class SubClass2 extends SuperClass2
{
	public void method1()
	{
		System.out.println("Subclass2-- Pusegaonakar");
	}
	
	public static void main(String[] args)
	{
		
		SuperClass2 x = new SuperClass2();
		x.method1();
		
		SubClass2 y = new SubClass2();
		y.method1();
		
 	}	

}

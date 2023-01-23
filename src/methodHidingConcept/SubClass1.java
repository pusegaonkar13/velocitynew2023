package methodHidingConcept;

public class SubClass1 extends SuperClass1 
{

	public static void method1()
	{
		System.out.println("SubClass- Method1");
	}
	
	public static void main(String[] args)
	{
		SubClass1.method1();
		SuperClass1.method1();
		
	}
}

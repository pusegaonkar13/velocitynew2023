package methodOver_riding;

public class SubClass extends SuperClass
{
	public void method1()
	{
		System.out.println("Child class- method1");
	}
	public static void main(String[] args)
	{
		SubClass z = new SubClass();
		z.method1();
		
	}
	

}

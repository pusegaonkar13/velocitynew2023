package interfaceDefaultMethod;

public class ImpPrashantClass implements InterfacePrashant
{
	public void method1()
	{
		System.out.println("hello");
	}
	
	public void method2()
	{
		System.out.println("bye");
		
		
	}
	public static void main(String[] args)
	{
		
		ImpPrashantClass x = new ImpPrashantClass();
		
		x.method1();
		x.method2();
		
		InterfacePrashant.method5();
		
		
		// default method
		x.method6();
	}
	

	
}

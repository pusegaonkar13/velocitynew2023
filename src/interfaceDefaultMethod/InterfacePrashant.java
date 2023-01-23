package interfaceDefaultMethod;

public interface InterfacePrashant 
{
	// incomplete non static method
	
	void method1();
	void method2();
	
	// complete non static method
	
//	public void method3()
//	{
//	System.out.println("hello");
//	}
	
	// static incomplete method
	
//	public abstract static void method4();
	
	public static void method5()
	{
		System.out.println("Static-interface");
	}
	
// complete method--> default method
// we need to use default keyword with it
	
	public default void method6()
	{
		System.out.println("Default interface");
	}
	
	public static void main(String[] args)
	{
		method5();
		
		// call default method
	/*	
		InterfacePrashant x = new InterfacePrashant();
		x.method6();  /// non static method cant be call at interface
		
		method6(); */
	}
	
}




















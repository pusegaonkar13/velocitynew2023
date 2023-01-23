package interfacePackConcept;

public interface InterfaceAkshay
{
	// incomplete method --> non static
	void method1();
	void method2();
	
	/* complete --> non static method
	public void method3()
	{
		System.out.println("Hello");
	} */
	
	/* static incomplete method
	public abstract static void method4();
	*/
	
	
	// static Complete method
	public static void method5()
	{
		System.out.println("Static - interface");
	}
	
	public default void method6()
	{
		System.out.println("Default- Interface");
		
	}
	
	public static void main(String[] args)
	{
		// call static method
		method5();
		
		/* call default method
		InterfaceAkshay x = new InterfaceAkshay();
		x.method6();		not possible
		
		method6();			not possible directly also
		*/
	}
	
}












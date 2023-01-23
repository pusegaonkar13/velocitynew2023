package interfacePackConcept;

public class ImpAkshayClass implements InterfaceAkshay
{

	@Override
	public void method1() 
	{
		System.out.println("Method1-ImplementsClass");
		
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Method2- ImplementsClass");
		
	}
	
	public static void main(String[] args) 
	{
		ImpAkshayClass y = new ImpAkshayClass();
		y.method1();
		y.method2();
		
	// call static complete method
		
		InterfaceAkshay.method5();
		
	// default method
		y.method6();
	}
	

}

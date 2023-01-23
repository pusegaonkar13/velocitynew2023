package interfacePackConcept;

public class ImpRahulClass implements InterfaceRahul 
{

	@Override
	public void method1() 
	{
	System.out.println("Method 1 interface-Imp class");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Method 2 interface -Imp calss");
		
	}
	
	public static void main(String[] args)
	{
		ImpRahulClass x = new ImpRahulClass();
		x.method1();
		x.method2();
		
	}

		

}

package interfacePackConcept;

public  class ImpSumitClass implements InterfaceSumit
{

	@Override
	public void method1() 
	{
		System.out.println("Hello");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Bye");
		
	}
	
	@Override
	public void method3() 
	{
		System.out.println("GoodBye");
	}	
		
	
	public static void main(String[] args) 
	{
		ImpSumitClass x = new ImpSumitClass();
		x.method1();
		x.method2();
		x.method3();
		
		
	}

	
}


		


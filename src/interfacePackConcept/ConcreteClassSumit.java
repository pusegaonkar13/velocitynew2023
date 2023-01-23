package interfacePackConcept;

public class ConcreteClassSumit extends ImpSumitClass
{

	@Override
	public void method3() 
	{
		System.out.println("Hiii");
		
		
	}
	public static void main(String[] args)
	
	{
		ConcreteClassSumit z = new ConcreteClassSumit();
		z.method1();
		z.method2();
		z.method3();
	}
	
	

}

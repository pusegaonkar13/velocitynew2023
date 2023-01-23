package casting;

public class ImpClass implements Interface1

{
	public void method1()
	{
		System.out.println("Interface- method1");
	}
	public void method2()
	{
		System.out.println("Interface- method2");
	}
	public void method3()
	{
		System.out.println("Interface- method3");
	}
	public void method4()
	{
		System.out.println("Interface- method4");
	}
	
	public static void main(String[] args)
	{
	// upcasting
	// parent refvar = new child();
		
		Interface1 x = new ImpClass();
		
		x.method1(); // interface
		x.method2(); // interface	
		
//		x.method3(); // imp class
//		x.method4(); // imp class
		
	}



	
	

}

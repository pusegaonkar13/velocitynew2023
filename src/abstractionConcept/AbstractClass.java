package abstractionConcept;


// abstract class--> incomplete class
public abstract class AbstractClass 
{
	// non static method
	public void method1()
	{
		System.out.println("Heloo-->method1-->non static--abstract class");
		
	}
	// static method
	
	public static void method2()
	{
		System.out.println("Bye--method2--static--abstract-class");
	}
	
	public static void main(String[] args) 
	{
	//1. can't create object for non static method in abstract class
	//2. calling static method
		method2();
		// static method is possible to call in abstract class
		
	}
	

}













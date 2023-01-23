package abstractionConcept;

public class ConcreteClass extends AbstractClass

{
	public static void main(String[] args) 
	{
		// calling non static method
		
		ConcreteClass x = new ConcreteClass();
		x.method1();
		
		AbstractClass.method2();
		
	}

}

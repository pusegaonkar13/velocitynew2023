package methodsInJava;

public class Program2AddtionNo 

{
	public static void addtioMethod()
	{
	int a= 10;
	int b= 20;
	int c = a + b ;
	System.out.println("Addition Of A AND B "+c);

	}
	
	public static void main(String[] args)
	{
	// directly calling 
		addtioMethod();
		
	// className.methodName();
		
		Program2AddtionNo.addtioMethod();
		
	}

}

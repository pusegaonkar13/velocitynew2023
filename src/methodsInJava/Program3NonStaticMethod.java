package methodsInJava;

public class Program3NonStaticMethod

{
// Non-static Method
	
	public void printcode()
	{
		System.out.println("This is non static method");
		System.out.println("Hi");
		System.out.println("bye");
		System.out.println("Hello");
	}
	
// Main method for calling with help of object	
	public static void main(String[] args)
	{
		
	Program3NonStaticMethod x = new Program3NonStaticMethod();
				
				x.printcode();
	}
	
}

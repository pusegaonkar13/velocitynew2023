package exceptionHanding;

public class EH4 
{
	public static void main(String[] args)
	{
		int a=100;
		int b = 0;
	//	int c = a/b;
		
		try
		{
			int c = a/b;
			
			System.out.println(c);
		}
		catch(Exception e)
		{
			// solution
			System.out.println("Cant divide the number by zero");
			System.out.println("change the value of b variable");
		}
		// run time  or unchecked error
		
		System.out.println("hello");
		System.out.println("hiii");
		System.out.println("bye");
		}

}

	// exception is not to provide the solution answer
	// exception continue the break flow of the program



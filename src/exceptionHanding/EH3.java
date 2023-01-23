package exceptionHanding;

public class EH3 
{
	public static void main(String[] args)
	{
		int a []= {10,20,30};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
//		System.out.println(a[3]); exception index out of bound length 3
		
		
		try 
		{
			System.out.println(a[3]);
		}
		
		catch(Exception e)
		{
			// solution 
			System.out.println("index 3 is not available");
			
		}
		finally 
		{
			// independent code
			System.out.println("hello");
			System.out.println("hiii");
			System.out.println("byee");
			
			}
		
	// this is run time exception 
	// unchecked exception 	
		
		
	}

}

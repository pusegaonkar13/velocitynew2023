package methodOverloading;

public class Program 
{
	/*Method overloading used for proper readability
	 *applicable for static as well as non static method
	 * 
	 *   write a multiple method with same name but different 
	      arguments*/
	
	public void method1()
	{
		System.out.println("This is method1- witout arguments");
	}
	
	public void method1(int a)
	{
		System.out.println("This is method1 with integer arguments");
		
	}
	
	public void method1(char a)
	{
		System.out.println("This is method1 with single char agruments");
		
	}
	public void method1(char a, char b)
	{
		System.out.println("This is method1 with two cahr arguments");
		
	}
	public void method1(String a,char b)
	{
        System.out.println("This is method1 with string and char arguments");
	}
	
	public static void main(String[] args)
	
	{
		
		Program x = new Program();
		x.method1();
		x.method1(10);
		x.method1('P');
		x.method1('P', 'S');
		x.method1("LOVE", 'S');
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
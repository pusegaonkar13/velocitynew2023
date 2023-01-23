

package constructorInJava;

public class Program4 
{
	// non static method without arguments	
	public void method2()
	{
		System.out.println("non static method2 without arguments");
		
	}
	
	// non static method with arguments
	public void method3(int x)
	{
		System.out.println("non static method3 with integer arguments");
	}
	
	// non static with return type String दिली
	
	public String method4()
	{
		System.out.println("non static  return type string");
		return "prashant";
	}
	
	public static void main(String[] args)
	{
		Program4 x = new Program4();
		{
			x.method2();
			x.method3(100);
			x.method4();
		}
				
		
	}

}

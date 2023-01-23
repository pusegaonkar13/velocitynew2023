// 
package constructorTypes;

public class Program3 
{
    // const 1	
	public Program3()
	{
		System.out.println("UDC without arguments");
	}
	
	//const 2
	
	public Program3(int x)
	{
		System.out.println("UDC with arguments");
	}
	
	public void method1()
	{
		System.out.println("Method1 is non static");
	}
	
	public static void main(String[] args) 
	{
	// create object 1
		Program3 x = new Program3();
				x.method1();
		
	// crete object 2
		
		Program3 y = new Program3(35);
				y.method1();
		
	}

}











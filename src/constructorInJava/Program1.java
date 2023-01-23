// non static method is not possible directly with the class name
// therefore we need create object with help of constructor

package constructorInJava;

public class Program1
{
	// this is non static method
	public void method1()
	{
		System.out.println("This is non static method");
		
	}
	
public static void main(String[] args)

{
	// we cant directly call the non static method we need to 
	// create object
	
//	method1();   // this is not possible
	
//	creating a object
	
	Program1 x = new Program1();
	x.method1();
	
}
}

// multiple times method calling with single object 
// and create 100 object and call method with each object

package constructorInJava;

public class Program5 
{
	// creat a non static method
	
	public void method1()
	{
		System.out.println("non static method");
		
		
	}
	public static void main(String[] args)
	{
	//	case 1 
	// we can create a 100 objects
	   /*
		Program5 x = new Program5();
		x.method1();
		Program5 y = new Program5();
		y.method1();
		Program5 z = new Program5();
		z.method1();
		*/
	// case 2 
	// create one object and call same method on multiple times
		Program5 a = new Program5();
		a.method1();
		a.method1();
		a.method1();
		a.method1();
		
		
	}	

}

// Program for non static

package staticNonstaticConcept;

public class Program2 
{
	int a = 100;
	
	public static void main(String[] args)
	{
		Program2 x = new Program2();
		System.out.println(x.a);       // 100
		
		x.a = 200;
	System.out.println(x.a);           // 200
	
	// create another object 
	
	Program2 y = new Program2();
	System.out.println(y.a);			//100
						
		
	}

}

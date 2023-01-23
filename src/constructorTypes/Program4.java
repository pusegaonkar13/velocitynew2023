package constructorTypes;

public class Program4 
{
	int a, b, c;        // variable declaration 
	
	public Program4()
	{
		a = 100;    // variable initialization of variable 
		b = 200;
		c= a+ b;
		System.out.println("value of c in 1 st const-->"+c);
	}
	
	public Program4(char x)
	{
		a = 1000;
		b = 2000;
		c = a+b;
		System.out.println("value of c in 2nd const -->"+c);
	}
	
	public static void main(String[] args)
	{
		// create object for const1
		
		Program4 x = new Program4();
		
		//  create object for const2
		Program4 y = new Program4('P');
	
	}
	

}












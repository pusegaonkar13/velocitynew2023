package constructorTypes;

public class program1 // this is default constructor

{
// create non static method
	public void method1()
	{
		System.out.println("method1 non static");
	}
	
	public static void main(String[] args)
	{
		
		program1 p = new program1();
		
		p.method1();
	}
	
/* if i am not writing any constructor in the program
 	and if still the constructor get called
 	then it is system defined / default constructor
*/
	

}

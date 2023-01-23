// Use of Method Overloading

package methodOverloading;

public class Program3
{
	// addition of two numbers
	
	public void Program3(int x,int y)
	{
		int a=x;
		int b=y;
		int c = a+b;
		System.out.println(c);
	}
	// addition of three number
	
	public void Program3(int x,int y,int z)
	{
		int a=x;
		int b=y;
		int c=z;
		int d = a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args)
	{
		Program3 x = new Program3();
		x.Program3(25, 75);
		x.Program3(25, 25, 25);
		
	}

}

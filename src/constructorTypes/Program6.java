package constructorTypes;

public class Program6 
{
	int a , b , c , d ;
	
	public Program6(int x, int y , int z)
	{
		a = x ;
		b = y ;
		d = z ;
		c = a + b + d;
		System.out.println(c);
	}
	public static void main(String[] args)
	
	{
		Program6 x = new Program6(10,20,30);
		
		Program6 y = new Program6(100,200,300);
 		
	}

}

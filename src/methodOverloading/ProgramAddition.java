package methodOverloading;

public class ProgramAddition 
{
	static int mul(int a,int b)
	{
		return a*b;
	}
	static int mul(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args)
	{
	System.out.println(ProgramAddition.mul(13,13));
	System.out.println(ProgramAddition.mul(12, 12, 12));
		
	}

}

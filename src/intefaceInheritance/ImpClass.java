package intefaceInheritance;

public class ImpClass implements Interface1,Interface2
{
	public void method1()
	{
		System.out.println("HI");
	}
	public static void main(String[] args) 
	{
		
		ImpClass x = new ImpClass();
		x.method1();
	}

}

// how to take multiple arguments

package methodsInJava;
public class Program12
{
/* Ex1	 create one static method with single arguments
	
	public static void method1(int x)
	{
		System.out.println("This is static method");
		System.out.println("pass one arguemnts");
*/
	
// Ex2 create one static method with 2 arguments
		
/*		public static void method2(int x,int y)
		{
		System.out.println("method with 2 integer arguments");	
		}
*/	
	
	
// Ex 3. create one static method with diff 3 args
	
	public static void method3(int x, char y, String z)
	{
		System.out.println("This method with Different Types of Arguments");
		
	}
	
	
		public static void main(String[] args)
	{
		//method1(10);
		
		//method2(10,20);
		
			method3(10,'p',"Prahant");
		
	}

}

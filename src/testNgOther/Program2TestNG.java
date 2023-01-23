package testNgOther;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program2TestNG 
{
	@BeforeMethod
	
	public void method1()
	{
		System.out.println("Method 1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method 2");
	}
	@AfterMethod
	public void method3()
	{
		System.out.println("Method 3");
	}
	

}

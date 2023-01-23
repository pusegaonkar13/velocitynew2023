package testNgOther;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program3TestNHG 
{
	@AfterMethod
	
	public void tearDown()
	{
		System.out.println("Browser Open");
	}
	
	@BeforeMethod()
	public void setup()
	{
		System.out.println("browse open,url open,login activity");
	}
	@Test
	public void verifylogin() 
	{
		System.out.println("Apply validation Tc is pass or fail");
		
	}
	
	

}

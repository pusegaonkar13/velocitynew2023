package testNgOther;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program4TestNG 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suit");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
	public void test()
	{
		System.out.println("test login functionlity");
		
	}
	@Test
	public void test2()
	{
		System.out.println("verify logout functionality");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	@AfterSuite()
	public void aftersuite()
	{
		System.out.println("after suite");
	}
	
	
	
	

}

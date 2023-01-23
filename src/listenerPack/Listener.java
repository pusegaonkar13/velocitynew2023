package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Execution is started");
		
	}
	
	public void onTestsucess(ITestResult result)
	{
		System.out.println("Test Case is Sucessfully Passed");
		
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is Failured to taking a screenshot");
		
	}

}

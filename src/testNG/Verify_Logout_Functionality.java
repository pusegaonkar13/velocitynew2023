package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Logout_Functionality extends TestBaseClass
{
	@Test
	public void VerifyLogOutFunctionality()
	{
		POM_Home_Page_Class hp = new POM_Home_Page_Class(driver);
		
		hp.clickedonsettingbtnmethod();
		System.out.println("Clicked on setting button");
		
		hp.clicklogoutbtnmethod();
		System.out.println("Clicked on logout button");
		
		System.out.println("Went on Login Page");
		
	// apply validation
		System.out.println("Apply the validation");
		
		String giventitle ="Swag Labs";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, giventitle);
		
		if(actualtitle.equalsIgnoreCase(giventitle))
		{
			System.out.println("Logout Test Case Passed");
		}
		else
		{
			System.out.println("Logout Test Case Failed");
		}
	}
	
}	
	



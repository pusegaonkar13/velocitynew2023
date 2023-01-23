package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Login_Functionality extends TestBaseClass
{
	
	@Test
	public void VerifyLoginFunctionality()
	{
	
		//---- Validation--//
		System.out.println("Apply the validation");
		
		String givenTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, givenTitle, actualTitle);
		
		if(actualTitle.equals(givenTitle))
		{
			System.out.println("Login Test Case Is Passed");
		}
		else
		{
			System.out.println("Login Test Case Is Failed");
		}
		
	
	}
}

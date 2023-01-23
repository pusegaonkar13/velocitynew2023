package swagLabProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_All_Functionality extends Test_Base_Class 
{
	@Test(priority=1)
	public void verifyLoginFunctionality()
	{
		//---- Validation for login --//
		System.out.println("Apply the validation");
		
		String givenTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if(givenTitle.equals(actualTitle))
		{
			System.out.println("Logoin Test case is passed");
		}
		else
		{
			System.out.println("Logoin Test case is Failed");
		}
	
	}
	
	//---- Validation for add to cart single product --//
	@Test(priority=2)
	public void addToCartProductFunctionlaity() throws InterruptedException
	{
		System.out.println("Verify add to cart functionality");
		POM_HOME_PAGE hp = new POM_HOME_PAGE(driver);
		hp.ClickedonSingleProduct();
		System.out.println("Select bag product");
		Thread.sleep(3000);
		
		String expectedselectedproduct="1";
		String actualselectedproduct=hp.ClickedonSingleProduct();
		Assert.assertEquals(actualselectedproduct, expectedselectedproduct);
		
		
		
//		if(expectedselectedproduct.equals(actualselectedproduct))
//		{
//			System.out.println("add to cart product Test case is passed");
//		}
//		else
//		{
//			System.out.println("add to cart product Test case is failed");
//		}
//		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//---- Validation for add to cart All product --//
//	
//	@Test(priority=3)
//	public void addtocartallproductfunctionality()
//	{
//		System.out.println("verify add to cart all product");
//		POM_HOME_PAGE hp = new POM_HOME_PAGE();
////		hp.clickallproduct();
//	System.out.println("All product selected");
//	String expectedProductSelection ="6";		
//	String actualProductSelected = hp.getTextFromAddToCartBtn();
//	
//	if(expectedProductSelection.equals(actualProductSelected)) 
//	{
//	
//		System.out.println("Bag Product Test case is passed");
//	}
//	else
//	{
//		System.out.println("Bag Product Test case is failed");
//	}
//		
//	
//	}
	
	

}

package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_AllProduct_AddToCart_Functionality extends TestBaseClass
{
	@Test
	public void addtocartallproductfunctionality() throws InterruptedException
	{
		POM_Home_Page_Class hp = new POM_Home_Page_Class(driver);
		hp.clickallproductmethod();
		System.out.println("All Product Selected");
		Thread.sleep(3000);	
		
		System.out.println("Apply The Validation");
		
		String expectedselectedproduct="6";
		String actualproductselected =hp.getTextFromAddToCartBtn();
		
		Assert.assertEquals(actualproductselected, expectedselectedproduct);
		
		
		
		
		
	}
	
	

}

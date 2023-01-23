package swagLabProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_DESCRIPTION_PAGE 
{
	WebDriver driver;
// clicked on checkout button
	
		@FindBy(xpath="//button[@id='checkout']")
		 WebElement clickOnCheckoutbtn;
		public void checkoutbtn()
		{
			clickOnCheckoutbtn.click();
		}
// clicked on continuous button
		@FindBy(xpath="//button[@id='continue-shopping']")
		 WebElement clickOnContinousbtn;
		public void continousbtn()
		{
			clickOnContinousbtn.click();
		}
// clicked on remove button		
		@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
		 WebElement clickOnremovebtn;
		public void removebutton()
		{
			clickOnremovebtn.click();
		}
		
	// constructor 
		
		public POM_DESCRIPTION_PAGE(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);		
		}
		

}

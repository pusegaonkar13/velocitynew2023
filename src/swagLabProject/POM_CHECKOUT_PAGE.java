package swagLabProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_CHECKOUT_PAGE 
{
	WebDriver driver;
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement clickedonbackbtn;
	public void backhomebutton()
	{
		clickedonbackbtn.click();
		
	}
// constructor
	
	public POM_CHECKOUT_PAGE(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	  
	}

	

}

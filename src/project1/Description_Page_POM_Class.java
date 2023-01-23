package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Description_Page_POM_Class 
{
	
	private WebDriver driver;
	
// Find Web elements
	
	@FindBy(xpath="//button[@id='checkout']")
	 WebElement clickOnCheckoutbtn;

// Static mehtod 
	
	public void checkoutbtn()
	{
		clickOnCheckoutbtn.click();
	}

// construtor
	
	public Description_Page_POM_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	
	
		
	
	
}

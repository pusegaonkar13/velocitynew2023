package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_OVERVIEW_PAGE
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finishbtn;
	
// method
	public void finishbutton()
	{
		finishbtn.click();
		
	}
// constructor
	
	public POM_OVERVIEW_PAGE(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	  
	}

}

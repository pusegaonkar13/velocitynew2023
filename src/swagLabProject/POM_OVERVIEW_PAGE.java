package swagLabProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_OVERVIEW_PAGE
{
	WebDriver driver;
	
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finishbtn;
	public void finishbutton()
	{
		finishbtn.click();
		
	}
	@FindBy(xpath="//button[@id='cancel']")
	WebElement clickedoncanclebtn;
	public void canclebutton()
	{
		clickedoncanclebtn.click();
		
	}


// constructor
	
	public POM_OVERVIEW_PAGE(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	  
	}
	

}

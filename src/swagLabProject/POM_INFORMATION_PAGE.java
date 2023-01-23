package swagLabProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_INFORMATION_PAGE 
{
	 WebDriver driver;
		
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;
	public void fname()
	   {
		   firstname.sendKeys("Prashant");
	   }
	   
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	public void lname()
	  {
		   lastname.sendKeys("dhabe");
	  }
	  
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalcode;
	 public void pcode()
	 {
		  postalcode.sendKeys("431401");
	  }
	  
	 @FindBy(xpath="//input[@id='continue']")
	 WebElement continebtn;
	 public void conbutton()
	  {
		  continebtn.click();
	  }
	 
	 @FindBy(xpath="//button[@id='cancel']")
	 WebElement cilckedoncanclebtn;
	 public void canclebutton() 
	 {
		 cilckedoncanclebtn.click(); 
		 
	 }
	  
	 public POM_INFORMATION_PAGE(WebDriver driver)
	  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		  
	  }

}

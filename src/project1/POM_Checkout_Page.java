package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Checkout_Page
{
	 WebDriver driver;
	
// Find Web element
	@FindBy(xpath="//input[@id='first-name']")
	WebElement firstname;

//method	
	public void fname()
   {
	   firstname.sendKeys("Prashant");
   }
   
   @FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	
//method
  public void lname()
  {
	   lastname.sendKeys("dhabe");
  }
  
  @FindBy(xpath="//input[@id='postal-code']")
	WebElement postalcode;
  
 // method
  public void pcode()

  {
	  postalcode.sendKeys("431401");
  }
  @FindBy(xpath="//input[@id='continue']")
 	WebElement continebtn;
 // method
  public void conbutton()
  {
	  continebtn.click();
  }
  
  public POM_Checkout_Page(WebDriver driver)
  {
	  this.driver=driver;
		PageFactory.initElements(driver, this);
	  
  }
  
  
  
	

}

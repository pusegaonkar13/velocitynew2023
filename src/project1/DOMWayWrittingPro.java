package project1;

import org.apache.xmlbeans.soap.SOAPArrayType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOMWayWrittingPro 
{
	public static void main(String[] agrs)
	{
//  document object model
	System.out.println("verify Login Functionality test case");
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opned");
	driver.manage().window().maximize();
	System.out.println("Browser maximized");
	driver.get("https://www.saucedemo.com/");
	System.out.println("url opened");
	WebElement username =  driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	System.out.println("User name entered");
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	System.out.println("Password entred");
	WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
	loginbtn.click();
	System.out.println("clicked on login button");
	// --- Home page--- //
	System.out.println("Went on home page");
	//---- Validation--//
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
	driver.quit();
	System.out.println("Browser is closed");
	System.out.println("End of the program");

	
	
	}

}

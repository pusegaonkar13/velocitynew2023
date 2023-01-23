package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is opend");
		Thread.sleep(3000);
		
	// UserName element find Action perform
	  WebElement username = driver.findElement(By.id("user-name"));
	  username.sendKeys("standard_user");
	  System.out.println("user name is enterted");
	  Thread.sleep(3000);
	  
    // password element find + action perform 
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("secret_sauce");
	  System.out.println("Password is entered");
	  
	 // Login button element find + action perform
	  WebElement loginbutton = driver.findElement(By.id("login-button"));
	  loginbutton.click();
	  System.out.println("Clicked on ligin button");
	  Thread.sleep(3000);
	 
	  //  Home page
	 System.out.println("Went to homePage");
	 
	 //  Validation
	 System.out.println("Apply the Validation");
	  
	  // String given Title ="SwagLabs"
	  String givenTitle="Swag Labs";
	  String actualTitle= driver.getTitle();
	  
	  if(givenTitle.equals(actualTitle))
	  {
		  System.out.println("Login Test is Passed");
	  }
	  else
	  {
		  System.out.println("Login Test is failed");
	  }
	  
	  driver.close();
	  System.out.println("browser is closed");
	  System.out.println("End of Program");
	  
	  
	  
	  
	  
	  
		
	}

}












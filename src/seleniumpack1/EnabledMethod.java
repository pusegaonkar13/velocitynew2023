package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
						
				WebDriver driver = new ChromeDriver();
				System.out.println("Browser is opend");
															
				driver.manage().window().maximize();
				System.out.println("Browser is maximized");
							
				driver.get("https://www.saucedemo.com/");
				System.out.println("url is opend");
				
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));	
	boolean result1 = username.isEnabled();
			
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));	
	boolean result2 = password.isEnabled();
	
	WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));	
	loginbtn.click();
	boolean result3 = loginbtn.isEnabled();
	
		
	// validation 
	
	if(result1= true)
	{
		username.sendKeys("standard_user");
		System.out.println("Element Entered");
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case Failed");
	}
	
	if(result2= true)
	{
		password.sendKeys("secret_sauce");
		System.out.println("password Entered");
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case Failed");
	}
	
	
	if(result3= true)
	{
		loginbtn.click();
		System.out.println("Login Button is Enabled");
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case Failed");
	}
	
	
	
	}
}

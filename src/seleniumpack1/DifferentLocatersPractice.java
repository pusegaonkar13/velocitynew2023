package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocatersPractice 
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
			
	// We Use Different locator 
	// 1. locator--> id  
//	WebElement username = driver.findElement(By.id("user-name"));		
	
	// 2. locator--> tagName 
	
//	 WebElement username = driver.findElement(By.tagName("input"));
	
	 
	// 3. locator--> className /class
	 
//	WebElement username = driver.findElement(By.className("input_error form_input"));
	 
	// 4. locator --> name
	 
	WebElement username = driver.findElement(By.name("user-name"));
	
	username.sendKeys("standard_user");
	
	Thread.sleep(3000);
	
	driver.close();
	 
	 
	 }

}

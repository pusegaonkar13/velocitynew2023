package seleniumMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SingleClickMouseActionProgram
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
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
		
// Click method of WebElement interface		
//	WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
//		loginbtn.click();

		
		// mouse action 
	WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));	
	
	Actions act = new Actions(driver);
	
	act.click(loginbtn).perform();
	
	System.out.println("End of Program");
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

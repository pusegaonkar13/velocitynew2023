package seleniumpack1;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotByMethod 
{
	static WebDriver driver; // declare it globally and only one time
	
	public static void screenshotmethod(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Public\\Eclipse\\ScreenshotFolder\\"+name+".jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("ScreenShot taken");
		
	}
	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
				System.out.println("Browser is opend");
								
				driver.manage().window().maximize();
				System.out.println("Browser is maximized");
								
				driver.get("https://www.saucedemo.com/");
				System.out.println("url is opend");
				
	// Screenshot of login page by calling static method
				
				screenshotmethod("loginpageprish");
				
				WebElement username = driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
				
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce");
				
				
				WebElement loginbtn = driver.findElement(By.id("login-button"));
				loginbtn.click();
				
	// screenshot of home page by calling static method
				
				screenshotmethod("homepageprish");
		
	
	
	/* validation 
			String givenTitle ="Swag Labs";
			String acturalTitle = driver.getTitle();
			
			if(givenTitle.equals(acturalTitle))
			{
				System.out.println("Login Test Case is passed");
			}
			else
			{
				System.out.println("Login Test Case is Failed");
			} */
	
	

}
	


}










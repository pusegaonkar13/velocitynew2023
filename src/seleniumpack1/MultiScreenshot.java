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

public class MultiScreenshot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				System.out.println("Browser is opend");
								
				driver.manage().window().maximize();
				System.out.println("Browser is maximized");
								
				driver.get("https://www.saucedemo.com/");
				System.out.println("url is opend");
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
				File destFile = new File("C:\\Users\\Public\\Eclipse\\ScreenshotFolder\\LoginPage.jpg");
				FileHandler.copy(sourceFile, destFile);
				System.out.println("ScreenShot taken");
			 	
				WebElement username = driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
				
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce");
				
				
				WebElement loginbtn = driver.findElement(By.id("login-button"));
					loginbtn.click();
					
					TakesScreenshot tst = (TakesScreenshot)driver;
					File sourceFile1 = tst.getScreenshotAs(OutputType.FILE);
					File destFile1 = new File("C:\\Users\\Public\\Eclipse\\ScreenshotFolder\\home Page.jpg");
					FileHandler.copy(sourceFile1, destFile1);
					System.out.println("ScreenShot taken");	
					
				// validation 
					String givenTitle ="Swag Labs";
					String acturalTitle = driver.getTitle();
					
					if(givenTitle.equals(acturalTitle))
					{
						System.out.println("Login Test Case is passed");
					}
					else
					{
						System.out.println("Login Test Case is Failed");
					}
					
					
					
					
}
	 }
				
	
		
	




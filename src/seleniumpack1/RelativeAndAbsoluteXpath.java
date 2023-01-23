package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeAndAbsoluteXpath
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Opend");
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Web Site Home page opend");
		
		
	// username absolate xpath
	
/*	WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		
	username.sendKeys("standard_user");
	System.out.println("User Name Entered");
	
	WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
		
	password.sendKeys("secret_sauce");
	
	System.out.println("Password Entered");
*/	
	
	// Relative xpath
	
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		 username.sendKeys("standard_user");
		 
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}










package seleniumAssignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
							
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opend");
												
	driver.manage().window().maximize();
	System.out.println("Browser is maximized");
												
	driver.get("https://www.instagram.com/");
	System.out.println("url is opend");
	
	
	 WebElement login = driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']"));
		login.sendKeys("9890649664");
		System.out.println("User name Entered");
		
	WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		password.sendKeys("prince1317");
		System.out.println("password Entered");
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}












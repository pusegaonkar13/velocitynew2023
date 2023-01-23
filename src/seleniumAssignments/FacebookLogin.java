package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
					
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
										
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
										
		driver.get("https://www.facebook.com/");
		System.out.println("url is opend");
	
//		WebElement username = driver.findElement(By.id("email"));
		
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		username.sendKeys("prince.dhabe@gmail.com");
		System.out.println("Enterted User Name");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		password.sendKeys("prashant19");
		System.out.println("Enterted password");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		login.click();
		System.out.println("Clicked Login button");
		
		
		  String givenTitle="facebook";
		  String actualTitle= driver.getTitle();
		  
		  if(givenTitle.equals(actualTitle))
		  {
			  System.out.println("Login Test is Passed");
		  }
		  else
		  {
			  System.out.println("Login Test is failed");
		  }
		  
		
		
}

}

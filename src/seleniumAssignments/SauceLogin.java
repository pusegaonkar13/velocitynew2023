package seleniumAssignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLogin
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
				
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));	
		username.sendKeys("standard_user");
		System.out.println("Entered user name");
		System.out.println("Enter User name");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		System.out.println("Enter password");
		Thread.sleep(2000);
	    WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click();
		System.out.println("clicked on login");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		button.click();
		System.out.println("Clicked on add to cart button");
		Thread.sleep(2000);
		
		
		
		WebElement shopcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shopcart.click();
		System.out.println("clicked on Shopcart button");
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]"));
		checkout.click();
		System.out.println("clicked on checkout button");
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input"));
		firstname.sendKeys("prashant");
		Thread.sleep(2000);
		  
		 WebElement lastname = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")); 
		 lastname.sendKeys("dhabe");
			Thread.sleep(2000);
		WebElement zipcode = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")); 
		zipcode.sendKeys("431401");
		Thread.sleep(2000);
		WebElement continues = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input"));
		continues.click();
		Thread.sleep(2000);
		WebElement finish = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[8]/button[2]"));
		finish.click();
		Thread.sleep(2000);
		
		System.out.println("went on home page");
		System.out.println("apply validations");
		
		String givenTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		if (givenTitle.equals(actualTitle))
		{
			System.out.println("login test is passed");
		}
		else
		{
			System.out.println("login test is failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

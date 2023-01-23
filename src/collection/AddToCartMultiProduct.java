package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartMultiProduct 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
							
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		 WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		 loginbtn.click();
		 
		 // Home page
		// single Element add to cart  
//		 	WebElement addtocart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
//		 	addtocart.click();
		 	
	// multiple element at a time at to cart
		 
		 
		 
		List<WebElement>allproducts = driver.findElements(By.xpath("//button[text()='Add to cart']"));

//		allproducts.get(0).click();
//		allproducts.get(1).click();
//		allproducts.get(2).click();
//		allproducts.get(3).click();
//		allproducts.get(4).click();
//		allproducts.get(5).click();
		

// use for loop
		for(int i=0;i<allproducts.size();i++)
		{
			allproducts.get(i).click();
		}
		
// Assignment try each for loop from Youtube		
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}














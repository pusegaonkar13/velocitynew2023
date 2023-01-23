package seleniumAssignments;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opend");
													
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
					
		driver.get("https://www.amazon.com/");
		System.out.println("url is opend");
		
		WebElement signin = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		signin.click();
		
		WebElement login = driver.findElement(By.xpath("//input[@id='ap_email']"));
		login.sendKeys("9890649664");
		System.out.println("User Name entered");
		
		WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
		conti.click();
		
	WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("prince1317");
		
		WebElement signbtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signbtn.click();
		
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("nokia 110 ta-1434 ds");
		
		WebElement sbt = driver.findElement(By.id("nav-search-submit-button"));
		sbt.click();
		
		WebElement hpbright = driver.findElement(By.xpath("//img[@class='s-image']"));
		
		hpbright.click();
	}

}

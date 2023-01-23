package seleniumpack1;


import java.awt.Point;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	
		
		// browser size set
		Dimension d = new Dimension(300,500);
		driver.manage().window().setSize(d);	
		Thread.sleep(3000);
		
		// browser.position set
		
//		Point p = new Point(400,400);
//		driver.manage().window().setPosition(p);
				
				
				
				
				
				
				
		
		
		
		
		
		
	}

}

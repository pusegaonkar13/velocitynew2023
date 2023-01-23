package collection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesWindowProgram 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
					
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
	 WebElement selebutton	= driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
	 selebutton.click();	
	 
	 List<String>allpageAdd = 
		new ArrayList <String>(driver.getWindowHandles());
		
	 	driver.switchTo().window(allpageAdd.get(1));
	 	
	 	WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	 		textbox.sendKeys("Hello Prashant");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}

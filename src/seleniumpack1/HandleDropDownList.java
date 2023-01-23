package seleniumpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownList
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
									
			WebDriver driver = new ChromeDriver();
			System.out.println("Browser is opend");
														
			driver.manage().window().maximize();
			System.out.println("Browser is maximized");
														
			driver.get("https://vctcpune.com/selenium/practice.html");
			System.out.println("url is opend");
			
	// how  to Select dropDown ListBox
			
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			
			dropdown.click();
			
			Select s = new Select(dropdown);
			
		// by three ways you call 
			//select by index method
			s.selectByIndex(2);
			
			//select by value method
			//s.selectByValue("Option3");
			
			//Select by visible text
			//s.selectByVisibleText("Option1");
			
			
			driver.close();
		
	}

}

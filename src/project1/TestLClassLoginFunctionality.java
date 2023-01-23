package project1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLClassLoginFunctionality 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("verify Login Functionality test case");
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opned");
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		driver.get("https://www.saucedemo.com/");
		System.out.println("url opened");
		
// Screen shot 
		Utility_class_screenshot.screenshotmethod(driver, "prashantsir");
		
		
		LoginPOMClass lp = new LoginPOMClass(driver);
		
		lp.username();
		System.out.println("User name entered");
		
		lp.password();
		System.out.println("Passwored Entered");
		
		lp.clcikloginbutton();
		System.out.println("Clicked on login Button");
		
		// --- Home page--- //
		System.out.println("Went on home page");
		
		// Screen shot 
				Utility_class_screenshot.screenshotmethod(driver, "prashantsirj=home");		
		
		//---- Validation--//
		System.out.println("Apply the validation");
		
		String givenTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if(givenTitle.equals(actualTitle))
		{
			System.out.println("Logoin Test case is passed");
		}
		else
		{
			System.out.println("Logoin Test case is Failed");
		}
		driver.quit();		
		System.out.println("Browser is closed");
		System.out.println("End of the program");

		
		
		
		
	}

}

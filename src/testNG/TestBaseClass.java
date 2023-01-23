package testNG;

import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import project1.LoginPOMClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	
	public void setup(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.out.println("verify Login Functionality test case");
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			
			System.setProperty("webdriver.gecko.driver", 
			"C:\\Users\\Public\\Eclipse\\Driver\\Firfox New Driver\\New\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
	
		
		System.out.println("Browser is opned");
		
		driver.manage().window().maximize();
		
		System.out.println("Browser maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url opened");
		
		//Screen shot 
		Utility_Class.screenshotmethod(driver, "prince1");
		
		// Login POM class object		
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
		Utility_Class.screenshotmethod(driver, "pusegaonkar358");
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser is closed");
		System.out.println("End of the program");
	}
	
	
	

}

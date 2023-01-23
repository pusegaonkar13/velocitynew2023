package swagLabProject;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import project1.HOME_PAGE_POM_CLASS;
import project1.LoginPOMClass;
import testNG.POM_Home_Page_Class;

public class Test_Base_Class 
{
	WebDriver driver;
	
	@BeforeClass
	public void setup1()
	{
		System.out.println("verify Login Functionality test case");
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is opned");
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url opened");
		
	}
	
	@BeforeMethod
	// login and ID AND password activity
	public void setup2()
	{
		LoginPOMClass lp = new LoginPOMClass(driver);
		
		lp.username();
		System.out.println("User name entered");
		
		lp.password();
		System.out.println("Passwored Entered");
		
		lp.clcikloginbutton();
		System.out.println("Clicked on login Button");
		
		// --- Home page--- //
		System.out.println("Went on home page");
		
	}
	
	@AfterMethod
	// Logout functionality	
		public void setup3()
		{
		HOME_PAGE_POM_CLASS hp = new HOME_PAGE_POM_CLASS(driver);
		// setting button
		hp.clicksettingbtn();
		System.out.println("clicked on setting button");
		
	// logout button
		hp.clicklogoutbtn();
		System.out.println("clicked on login button");
		
		}
	
	
	@AfterClass 
	//close browser
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser is closed");
		System.out.println("End of Program");
		
	}
	
	

}

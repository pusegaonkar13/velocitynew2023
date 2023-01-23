package project1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Home_Logout_testCase
{
	public static void main(String[] args)
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
		
// login activity 
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.username();
		System.out.println("User name entered");
		
		lp.password();
		System.out.println("Password entered");
		
		lp.clcikloginbutton();
		System.out.println("clicked on login button");
		
	// home page
		System.out.println("Went on home page");
	
	
		HOME_PAGE_POM_CLASS hp = new HOME_PAGE_POM_CLASS(driver);
		
	// Clicked on Drop down button
		hp.clickonFilterDrop();
		System.out.println("clicked on filter Drop Down button");
		
		
	// setting button
		hp.clicksettingbtn();
		System.out.println("clicked on setting button");
		
	// logout button
		hp.clicksettingbtn();
		System.out.println("clicked on login button");
		
	// login page
		System.out.println("Went on login page");
		
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

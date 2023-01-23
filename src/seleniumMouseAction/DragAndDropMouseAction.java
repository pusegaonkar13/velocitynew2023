package seleniumMouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseAction 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
						
				WebDriver driver = new ChromeDriver();
				System.out.println("Browser is opend");
															
				driver.manage().window().maximize();
				System.out.println("Browser is maximized");
							
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				System.out.println("url is opend");
				
		WebElement	oslo = driver.findElement(By.xpath("//*[@id=\"box1\"]"));	
		WebElement norway = driver.findElement(By.xpath("//*[@id=\"box101\"]"));		
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(oslo, norway).perform();
		Thread.sleep(2000);
		
		WebElement	copenhagen = driver.findElement(By.xpath("//*[@id=\"box4\"]"));	
		WebElement denmark = driver.findElement(By.xpath("//*[@id=\"box104\"]"));		
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(copenhagen, denmark).perform();
		Thread.sleep(2000);
		
		WebElement washington = driver.findElement(By.xpath("//*[@id=\"box3\"]"));	
		WebElement unitedstate = driver.findElement(By.xpath("//*[@id=\"box103\"]"));		
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(washington, unitedstate).perform();
		Thread.sleep(2000);
		
		WebElement stockholm = driver.findElement(By.xpath("//*[@id=\"box2\"]"));	
		WebElement sweden = driver.findElement(By.xpath("//*[@id=\"box102\"]"));		
		Actions act4 = new Actions(driver);
		act4.dragAndDrop(stockholm, sweden).perform();
		Thread.sleep(2000);
		
		WebElement seoul = driver.findElement(By.xpath("//*[@id=\"box5\"]"));	
		WebElement southkorea = driver.findElement(By.xpath("//*[@id=\"box105\"]"));		
		Actions act5 = new Actions(driver);
		act5.dragAndDrop(seoul, southkorea).perform();
		Thread.sleep(2000);
		
		WebElement rome = driver.findElement(By.xpath("//*[@id=\"box6\"]"));	
		WebElement italy = driver.findElement(By.xpath("//*[@id=\"box106\"]"));		
		Actions act6 = new Actions(driver);
		act6.dragAndDrop(rome, italy).perform();
		Thread.sleep(2000);
		
		
		WebElement madrid = driver.findElement(By.xpath("//*[@id=\"box7\"]"));	
		WebElement spain = driver.findElement(By.xpath("//*[@id=\"box107\"]"));		
		Actions act7 = new Actions(driver);
		act7.dragAndDrop(madrid, spain).perform();
		Thread.sleep(2000);
		
		
		
		
		
	}

}


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import MbDriverSetup.MbDriverSetup;
import io.github.bonigarcia.wdm.WebDriverManager;
//
public class App 
{
//WebDriver driver;
////	
//	public void SwitchToReadyToMove() {
//		String mainWindowHandle = driver.getWindowHandle();
//
//		Set<String> allWindowHandles = driver.getWindowHandles();
//
//		for (String handle : allWindowHandles) {
//		    if (!handle.equals(mainWindowHandle)) {
//		        driver.switchTo().window(handle);
//
//		    }
//		}
//	}
    	
	
////		System.out.println(driver.getWindowHandles());
// 
public static void main(String args[]) throws InterruptedException, AWTException {
////		WebDriverManager.chromedriver().setup();
////		WebDriver driver = new ChromeDriver();
////		driver.get("https://www.magicbricks.com/");
////		driver.manage().window().maximize();
////		
//		
//		driver = MbDriverSetup.chromedriver();
//		
////		String mainWindowHandle = driver.getWindowHandle();
////		Set<String> allWindowHandles = driver.getWindowHandles();
////		
////		for(String handle: allWindowHandles) {
////			driver.switchTo().window(handle);
////		}
//		
////		WebElement element = driver.findElement(By.xpath("//a[text()=\"Sell\"]"));
////	    Actions action = new Actions(driver);
////	    action.moveToElement(element).perform();
////	    Thread.sleep(1000);
////		driver.findElement(By.xpath("//a[text() =\"Ad Packages\"]")).click();
////		
////		Thread.sleep(4000);
////		driver.findElement(By.xpath("//*[@id=\"userTypeList\"]/li[2]/label")).click();
////		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div[1]/form/div[1]/div[5]/div[2]/input")).click();
//		
//		
//		WebElement element = driver.findElement(By.xpath("//a[text()=\"Sell\"]"));
//		 Actions action = new Actions(driver);
//		    action.moveToElement(element).perform();
//		    Thread.sleep(1000);
//			driver.findElement(By.xpath("//a[text() =\"iAdvantage\"]")).click();
//			 Thread.sleep(1000);
//			 driver.findElement(By.xpath("//a[text()=\"Add to My Orders\"]")).click();
//			 	
//		
//	
	
//	Robot robot = new Robot();
//	  robot.keyPress(KeyEvent.VK_UP);
//	  robot.keyRelease(KeyEvent.VK_UP);
//	  Thread.sleep(1000);
//	  robot.keyPress(KeyEvent.VK_UP);
//	  robot.keyRelease(KeyEvent.VK_UP);
//	  Thread.sleep(1000);
//	  robot.keyPress(KeyEvent.VK_ENTER);  
//	  robot.keyRelease(KeyEvent.VK_ENTER);
//	  Thread.sleep(1000);
	
	
	WebDriver driver;
	driver = MbDriverSetup.chromedriver();
	Thread.sleep(2000);
	
	WebElement element = driver.findElement(By.xpath("//a[text()=\"Sell\"]"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[text()=\"Property Valuation\"])[1]")).click();
	String mainWindowHandle = driver.getWindowHandle();
	
			Set<String> allWindowHandles = driver.getWindowHandles();
	
			for (String handle : allWindowHandles) {
			    if (!handle.equals(mainWindowHandle)) {
			        driver.switchTo().window(handle);
	
			    }
			}
	Thread.sleep(2000);
	
	Robot robot = new Robot();
	driver.findElement(By.name("keywordLoc")).sendKeys("Pune ");
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  Thread.sleep(1000);
	  robot.keyPress(KeyEvent.VK_ENTER); 
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(1000); 
	  
	  
	//driver.findElement(By.xpath("//div[@id=\"keyword_suggest_Loc\"]//div[2]//a")).click();
	driver.findElement(By.xpath("//li[@id=\"pty-10002\"]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	

	WebElement s = driver.findElement(By.xpath("//input[@placeholder=\"Enter Area\"]"));
	s.click();
	s.sendKeys("400");
	
	js.executeScript("window.scrollBy(0,200)");
	
    driver.findElement(By.xpath("//input[@id=\"selectFloorValTwo\"]")).click();
    driver.findElement(By.xpath("//li[@value=\"flr-11199\"]")).click();
    
    driver.findElement(By.xpath("//input[@id=\"parkingOpenVal\"]")).click();
    
    driver.findElement(By.xpath("//li[@value=\"oppar-1\"]")).click();
    
    driver.findElement(By.xpath("(//input[@value=\"Check Now\"])[3]")).click();
    
	//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div[1]/form/div[1]/div[2]/div[2]/ul/li[2]/label/input")).click();
	
	
//	String maiWindowHandle = driver.getWindowHandle();
//	
//	Set<String> alWindowHandles = driver.getWindowHandles();
//
//	for (String handle : alWindowHandles) {
//	    if (!handle.equals(maiWindowHandle)) {
//	        driver.switchTo().window(handle);
//
//	    }
//	}
//	driver.findElement(By.xpath("//input[@value=\"Show Me Packages\"]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//label[@for=\"rent1\"]")).click();
//	Thread.sleep(2000);
//
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,900)");
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//a[@href=\"https://www.magicbricks.com/bricks/packageGroup.html?Package=50669\"]")).click();
//	Thread.sleep(5000);
//	
//	driver.findElement(By.id("userName")).sendKeys("Darshana");
//	driver.findElement(By.name("phoneNumber")).sendKeys("7465324901");
//	driver.findElement(By.name("email")).sendKeys("darshana@gmail.com");
//	driver.findElement(By.xpath("//input[@name=\"keyword\"]")).sendKeys("Nagpur");
//	driver.findElement(By.id("query")).sendKeys("I want to ask about ad packages you can call me at 9:00Am");
//	
//	Thread.sleep(2000);
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,200)");
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//label[@for=\"chk-TNC\"]")).click();
//	driver.findElement(By.id("callBackSubmit")).click();
//	Thread.sleep(2000);
	
	//js.executeScript("window.scrollBy(0,-200)");
	
//	driver.findElement(By.className("//input[@id=\"keywordLoc\"]")).click();
//	driver.navigate().back();
//	driver.findElement(By.xpath("//a[@class=\"addToCartBtn _addToCartBtn\"]")).click();
	}
}

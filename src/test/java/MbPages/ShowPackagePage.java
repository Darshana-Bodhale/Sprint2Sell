package MbPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShowPackagePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	//Scenario 1 -----------------Element Locators -[Ad Packages] -------------------------------------->
	
	@FindBy(xpath = "//a[text()=\"Sell\"]") WebElement sell;
	
	@FindBy (xpath="//a[text() =\"Ad Packages\"]") WebElement Adpackage;
	
	@FindBy (xpath="//input[@value=\"Show Me Packages\"]") WebElement submit;
	
	@FindBy(xpath="//label[@for=\"rent1\"]")WebElement rent;
	
	@FindBy(xpath="//a[@href=\"https://www.magicbricks.com/bricks/packageGroup.html?Package=50669\"]") 
	WebElement buyNow;
	
	@FindBy(xpath="//span[text()=\"6828\"]") WebElement PayableAmount;
	
	
	
	//Scenario 2 ---------------- Element Locators -[Request a CallBack]----------------------------------------->
	
	@FindBy(id= "userName") WebElement usrnme;
	
	@FindBy(name = "phoneNumber") WebElement phoneno;
	
	@FindBy(name = "email") WebElement mail;
	
	@FindBy(xpath= "//input[@name=\"keyword\"]") WebElement city;
	
	@FindBy(id = "query") WebElement query;
	
	@FindBy(xpath= "//label[@for=\"chk-TNC\"]") WebElement chckbox;
	
	@FindBy (id = "callBackSubmit") WebElement submit2;
	

	
	//Scenario 3 ------------------Element Locators-[Request a CallBack]-------------------------------------->
	
	@FindBy(xpath = "//p[@class=\"callNum\"]") WebElement text;
	
	@FindBy(xpath= "//div[@id = \"cityNameErr\"]") WebElement error;
	
	@FindBy (xpath="//p[@class=\"callTiming\"]") WebElement msg;


	
	//Scenario 4 ------------------ Element Locators -[iAdvantage] --------------------------------------->
	
	@FindBy(xpath = "//a[text()=\"iAdvantage\"]") WebElement iadvantage;
	
	@FindBy(className = "orderNoArrow") WebElement viewCart;
	
	@FindBy (xpath= "//a[@class=\"addToCartBtn _addToCartBtn\"]") WebElement addtocart;
	
	@FindBy (xpath = "//div[@id=\"totalCurrentCartItems\"]") WebElement text2;
	

	
	//Scenario 5 ------------------- Element Locators - [Property Valuation]------------------------------------------->

	@FindBy (xpath="(//a[text()=\"Property Valuation\"])[1]") WebElement propertyValuation;
	
	@FindBy (name = "keywordLoc") WebElement search;
	
	@FindBy (xpath= "//li[@id=\"pty-10002\"]") WebElement type;
	
	@FindBy (xpath= "//input[@placeholder=\"Enter Area\"]") WebElement area;
	
	@FindBy (xpath = "//input[@id=\"selectFloorValTwo\"]") WebElement floor;
	
	@FindBy (xpath = "//li[@value=\"flr-11199\"]") WebElement floordropd;
	
	@FindBy (xpath = "//input[@id=\"parkingOpenVal\"]") WebElement parkingop;
	
	@FindBy (xpath = "//li[@value=\"oppar-1\"]") WebElement parkingdropd;
	
	@FindBy (xpath = "(//input[@value=\"Check Now\"])[3]") WebElement submit3;
	
	@FindBy (xpath = "//div[@class=\"searchProjInfo\"]") WebElement display;
	
//-------------------------------------- Scenario 1 ---------------------------------------------> 
	
	
			public ShowPackagePage(WebDriver driver) 
			{
				this.driver = driver;
				PageFactory.initElements(driver,this);
			}
			
			public void SwitchToMove() 
			{
				String mainWindowHandle = driver.getWindowHandle();
		
				Set<String> allWindowHandles = driver.getWindowHandles();
		
				for (String handle : allWindowHandles) {
				    if (!handle.equals(mainWindowHandle)) {
				        driver.switchTo().window(handle);
		
				    }
				}
		    }
		
			public void HoverSell()
			{
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		    	wait.until(ExpectedConditions.visibilityOf(sell));
		    	
			    Actions action = new Actions(driver);
			    action.moveToElement(sell).perform();
			}
			
			public void clickAdPackage() 
			{
				
				Adpackage.click();
			}
			
			public void clickShowPackage() 
			{
				submit.click();
			}
			
			public void selectRent() 
			{
				rent.click();
			}
			
			public void scrolldown() 
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,900)");
			}
			public void clickBuyNow() 
			{
				buyNow.click();
			}
			public String totalPayableAmount() 
			{
				return PayableAmount.getText();
			}
	
//----------------------------------------------- Scenario 2 ------------------------------------------> 
		
	       public void typeData (String UserName, String PhoneNumber, String Email, 
			String City,String Query) 
		    {
	    	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
	    	    wait.until(ExpectedConditions.visibilityOf(usrnme));
	    	    
			     usrnme.sendKeys(UserName);

			     phoneno.sendKeys(PhoneNumber);

			     mail.sendKeys(Email);
			    
			     city.sendKeys(City);

			     query.sendKeys(Query);
			     
		     }
	       
			public void scrollDown() 
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,200)");
			}
			
			public void clickCheckbox() 
			{
			
				chckbox.click();
			}
			
			public void submitButton() 
			{
				submit2.click();
			}
			
			public void scrollUp() 
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,-200)");
			}
			
			public String ThankyouMessage() 
			{	
				return text.getText();
			}

//----------------------------------------------- Scenario 3 -------------------------------------------> 
			
			public void invalidData(String UserName, String PhoneNumber, String Email)  
			{
				usrnme.sendKeys(UserName);
			
			    phoneno.sendKeys(PhoneNumber);

			    mail.sendKeys(Email);
			     
			}
			
			public String errorMsg() 
			{
				return error.getText();
			}
			
			public String message()  
			{
				return msg.getText();
			}
//----------------------------------------------- Scenario 4 ---------------------------------------------> 
			
			public void clickIAdvantage() 
			{
				iadvantage.click();
			}
			
			public void viewCart() 
			{
				viewCart.click();
			}
			
			public void addToCart() 
			{
				addtocart.click();
			}
			
			public String errmsg() 
			{
				return text2.getText();
			}
			
//----------------------------------------------- Scenario 5 ------------------------------------------------> 
			
			public void propertyVal() 
			{
				propertyValuation.click();
			}
			
			public void search(String City) throws InterruptedException, AWTException 
			{
				Robot robot = new Robot();
				
				search.sendKeys(City);
				Thread.sleep(1000);
			    robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				
				robot.keyPress(KeyEvent.VK_ENTER); 
				robot.keyRelease(KeyEvent.VK_ENTER);
				 
			}
			
			public void clickPropertyType() 
			{
				type.click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,200)");
			}
			
			public void enterArea(String Area) 
			{
				area.click();
				area.sendKeys(Area);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,200)");
			}
			
			public void selectFloor() 
			{
				floor.click();
				floordropd.click();
			}
			
			public void selectOpenParking() 
			{
				parkingop.click();
				parkingdropd.click();
			}
			
			public void clickSubmit() 
			{
				submit3.click();
			}
			
			public String display() 
			{
				return display.getText();
			}
}

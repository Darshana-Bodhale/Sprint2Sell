package MbDriverSetup;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MbDriverSetup {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static EdgeOptions options1;

	
	
	public static WebDriver chromedriver() {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	//	WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-notifications");
		options.addArguments("disable-popup-blocking");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.magicbricks.com/");
		return driver;
	}
	
//----------------------------------------------- EdgeDriver ----------------------------------------------------------------- 
	  
	
		public static WebDriver edgedriver() {
		WebDriverManager.edgedriver().setup();
		options1=new EdgeOptions();
		options1.addArguments("--start-maximized");
		//options1.addArguments("incognito");
		options1.addArguments("disable-notifications");
		options1.addArguments("disable-popup-blocking");
		//options1.addArguments("headless");
		//options1.addArguments("disable-blink-features-AutomationControlled");
		driver = new EdgeDriver(options1);
		driver.get("https://www.magicbricks.com/");
		return driver;
	}

}


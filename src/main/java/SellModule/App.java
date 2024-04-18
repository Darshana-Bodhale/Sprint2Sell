package SellModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		
		

		driver.findElement(By.xpath("//a[text()=\"Sell\"]"));
		driver.findElement(By.xpath("//a[text() =\"Ad Packages\"]")).click();
		
		
		driver.findElement(By.xpath("//input[@value=\"agent\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"btn primary_btn _individualFormSubmit\"]")).click();
	}
}


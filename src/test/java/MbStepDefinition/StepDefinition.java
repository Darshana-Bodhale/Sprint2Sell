package MbStepDefinition;


import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import MbDriverSetup.MbDriverSetup;
import MbPages.ShowPackagePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;


public class StepDefinition {

	static WebDriver driver;
	ShowPackagePage showpckg;
	
	@Given("User has opened the magic bricks website")
	public void user_has_opened_the_magic_bricks_website() {
		 driver = MbDriverSetup.chromedriver();
//		 driver = MbDriverSetup.edgedriver();
		 showpckg=new ShowPackagePage(driver);
		 
	}

	@When("user hover over the sell module")
	public void user_hover_over_the_sell_module()  {
		showpckg.HoverSell();	
	}

	@And("user clicks on ad packages")
	public void user_clicks_on_ad_packages() {
		showpckg.clickAdPackage();
		showpckg.SwitchToMove();
		
	}

	@And("user clicks on show me packages")
	public void user_clicks_on_show_me_packages() {
		 showpckg.clickShowPackage();

	}

	@When("user selects rent function")
	public void user_selects_rent_function() {
	    showpckg.selectRent();
		
	}

	@And("Scroll down to buy the package")
	public void scroll_down_to_buy_the_package() {
		showpckg.scrolldown();

		
	}

	@And("user clicks on Buy Now for gold plus package")
	public void user_clicks_on_buy_now_for_gold_plus_package() {
	    showpckg.clickBuyNow();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	    	
	}

	@Then("Add to My orders page should be displayed")
	public void add_to_my_orders_page_should_be_displayed() {
		String actual = driver.getCurrentUrl();
		String expected = "https://www.magicbricks.com/bricks/packageGroup.html?Package=50669";
		Assert.assertEquals(expected,actual);	
	}

//<----------------------------------------------- Scenario 2 ---------------------------------------------->
	
	@When("user hover to the sell module")
	public void user_hover_to_the_sell_module()  {
		showpckg.HoverSell();
	}
	
	@When("User clicks the Ad packages")
	public void user_clicks_the_ad_packages() {
		showpckg.clickAdPackage();
		showpckg.SwitchToMove();
	}

	@And("^User enters (.*),(.*),(.*),(.*) and (.*)$")
	public void user_enters_and(String UserName, String PhoneNumber, String Email, String City, String Query){
		showpckg.typeData(UserName, PhoneNumber, Email, City, Query);
	}

	@And("User clicks the CheckBox")
	public void user_clicks_the_check_box()  {
		showpckg.scrollDown();
		showpckg.clickCheckbox();
		
	}

	@And("User clicks on the request a callback")
	public void user_clicks_on_the_request_a_callback()  {
		showpckg.submitButton();
		showpckg.scrollUp();
		
	}

	@Then("It should display their number")
	public void it_should_display_a_thankyou_message() throws InterruptedException {
		String text = "+91 9870 260 930";
		String msg = showpckg.ThankyouMessage();
		Assert.assertEquals(text,msg);	
		
	}
	
//<----------------------------------------------- Scenario 3 ------------------------------------------------>
 
	
	@When("user clicks on the ad packages")
	public void user_clicks_on_the_ad_packages() {
		showpckg.clickAdPackage();
		showpckg.SwitchToMove();
	}

	@When("user fill some of the credentials and some leave blank")
	public void user_fill_some_of_the_credentials_and_some_leave_blank(DataTable credentials) {
		List<List<String>> cells = credentials.cells();
		showpckg.invalidData(cells.get(0).get(0), cells.get(0).get(1), cells.get(0).get(2));
		showpckg.clickCheckbox();
	}
	
	@When("user scroll down the webpage")
	public void user_scroll_down_the_webpage() {
		showpckg.scrollDown();
	}

	@When("clicks on request a callback")
	public void clicks_on_request_a_callback()  {
		showpckg.submitButton();
	}

	@Then("Fields which are empty should display the error message")
	public void fields_which_are_empty_should_display_the_error_message() throws InterruptedException {
		String errmsg = showpckg.errorMsg();
		Assert.assertEquals(errmsg,"Compulsory field. Cannot be blank.");
	}

	
	
//<----------------------------------------------- Scenario 4 ------------------------------------------->
 
	
	@When("user clicks on iAdvantage")
	public void user_clicks_on_i_advantage() {
		showpckg.clickIAdvantage();
	    showpckg.SwitchToMove();
		
	}

	@When("clicks on go to cart user should ask for login")
	public void clicks_on_go_to_cart_user_should_ask_for_login() {
		showpckg.viewCart();
		
	}

	@When("user move back to the iAdvantage")
	public void user_move_back_to_the_i_advantage() {
		driver.navigate().back();
		
	}

	@When("clicks on Add to my orders")
	public void clicks_on_add_to_my_orders() {
		showpckg.addToCart();
		
	}

	@Then("Product should not be added to cart")
	public void product_should_not_be_added_to_cart() {
	   String msg = showpckg.errmsg();
	   Assert.assertEquals(msg,"0");
	   
	}
	
//<----------------------------------------------- Scenario 5 ---------------------------------------> 
	
	
	@When("user clicks on property Valuation")
	public void user_clicks_on_property_valuation() {
		showpckg.propertyVal(); 
	    showpckg.SwitchToMove();
		
	}

	@When("^enters the (.*) name$")
	public void enters_the_name(String City) throws InterruptedException, AWTException {
		showpckg.search(City);
		
	}

	@When("select the property type")
	public void select_the_property_type() {
		showpckg.clickPropertyType();
		
	}

	@When("^enters the (.*) of property$")
	public void enters_the_of_property(String Area) {
		showpckg.enterArea(Area);
		
	}

	@When("selects the floor")
	public void selects_the_floor() {
		showpckg.selectFloor();
		
	}

	@When("selects the number of cars for open parking")
	public void selects_the_number_of_cars_for_open_parking() {
		showpckg.selectOpenParking();
		
	}

	@When("clicks on check now")
	public void clicks_on_check_now() {
		showpckg.clickSubmit();
		
	}

	@Then("Estimated price of the property should be displayed")
	public void estimated_price_of_the_property_should_be_displayed() {
		 String msg2 = showpckg.display();
		   Assert.assertEquals(msg2,"Flat 2 BHK, 400 Sq-ft, in Pune Solapur Highway, Pune");	
	}

	
//THIS IS AFTERSTEP METHOD USE TO TAKE SCREENSHOTS AFTER EVERY SCENARIOS IS EXECUTED
	@AfterStep
	public static void takeScreendown(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
}

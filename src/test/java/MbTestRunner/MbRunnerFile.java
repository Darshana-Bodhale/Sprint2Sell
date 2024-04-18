package MbTestRunner;

	import org.junit.runner.RunWith;
	 
	import io.cucumber.junit.Cucumber;
	
//	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	 
	@RunWith(Cucumber.class)
	
	@CucumberOptions(features="src\\test\\resource\\MbFeatures\\Sell.feature",
	glue="MbStepDefinition",tags = "@validCredentials"
//	plugin= {"pretty", 
//			"html:target/HTMLReports/MagicBricksReport.html",	
//			"json:target/JSONReports/MagicBricksReport.json",
//			"junit:target/JUNITReports/MagicBricksReport.xml",
//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//	}
	
	)
	 

	public class MbRunnerFile extends AbstractTestNGCucumberTests{
		
	}


package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.Common;
import utils.ReadFile;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class BaseTest {

	Common common;
	static WebDriver driver;
	String configPropertyFile = "config.properties";
	Properties prop;

	public void getProperties() {
		ReadFile rf = new ReadFile();
		prop = rf.readPropertiesFile(configPropertyFile);
		
	}
	
	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser) {	
		
		getProperties();
		
		//Check for parallel testing
		Boolean parallelExecution = Boolean.valueOf(prop.getProperty("parallel"));
		
		if(parallelExecution==false)
			browser = prop.getProperty("browser");
		
		Reporter.log("browser used = " + browser);	
		
		common = new Common();
		common.setupBrowser(browser, prop.getProperty("url"));
		driver = common.getDriver();
	}

	@AfterTest
	public void afterTest() {
		common.quitBrowser();
	}

}

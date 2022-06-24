package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{
	@Test
	public void titleValidation() {
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		Reporter.log("Expected Title = " + expectedTitle);
		Reporter.log("Actual Title = " + actualTitle);
		
		assertTrue(actualTitle.equals(expectedTitle), "Page Title validation failed,");
	}
	
	@Test
	public void urlValidation() {
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("Expected URL = " + expectedUrl);
		Reporter.log("Actual URL = " + actualUrl);
		
		assertTrue(actualUrl.equals(expectedUrl), "Mismatch in URL,");
	}
}

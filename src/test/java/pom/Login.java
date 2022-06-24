package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Login {

	private WebDriver driver;
	
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	@CacheLookup
	@FindBy(name = "pass")
	WebElement passwd;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement loginBtn;
	
	@CacheLookup
	@FindBy(partialLinkText = "Forgotten password?")
	WebElement forgotPasswordLink;
	
	@CacheLookup
	@FindBy(id = "identify_email")
	WebElement forgotPasswordEmail;
	
	@CacheLookup
	@FindBy(id = "did_submit")
	WebElement searchBtn;
	
	@CacheLookup
	@FindBy(partialLinkText = "Cancel")
	WebElement cancelBtn;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginWithCredentials(String username, String password) {
	
		Reporter.log("username = " + username);
		Reporter.log("password = " + password);
		
		email.clear();
		email.sendKeys(username);
		
		passwd.clear();
		passwd.sendKeys(password);
		
//		loginBtn.click();
	}
	
	public void forgotPassword(String username, boolean confirm) {
		forgotPasswordEmail.clear();
		forgotPasswordEmail.sendKeys(username);
		
		if(confirm)
			searchBtn.click();
		else
			cancelBtn.click();		
	}
	
	public void clickLink(String linkName) {
		driver.findElement(By.partialLinkText(linkName)).click();
	}
	
	public void changeLanguage(String language) {
	
		if(language.equals("english"))
			clickLink("English (UK)");
		else if(language.equals("hindi"))
			clickLink("हिन्दी");
	}
	
}











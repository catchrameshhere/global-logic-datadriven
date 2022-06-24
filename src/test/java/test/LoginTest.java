package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;

public class LoginTest extends BaseTest{

	@Parameters({"validUsername", "validPassword"})
	@Test
	public void validUsernameValidPasswordTest(String username, String password) {
		Login login = new Login(driver);		
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"invalidUsername", "validPassword"})
	@Test
	public void invalidUsernameValidPasswordTest(String username, String password) {
		Login login = new Login(driver);		
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"validUsername", "invalidPassword"})
	@Test
	public void validUsernameInvalidPasswordTest(String username, String password) {
		Login login = new Login(driver);		
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"invalidUsername", "invalidPassword"})
	@Test
	public void invalidUsernameInvalidPasswordTest(String username, String password) {
		Login login = new Login(driver);		
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"validPassword"})
	@Test
	public void blankUsernameValidPasswordTest(String password) {
		String username = "";
		Login login = new Login(driver);		
		login.loginWithCredentials(username, password);
	}
	
	@Parameters({"validUsername"})
	@Test
	public void validUsernameBlankPasswordTest(String username) {
		String password = "";
		Login login = new Login(driver);		
		login.loginWithCredentials(username, password);
	}
	
	
	@Test
	public void blankUsernameBlankPasswordTest() {
		String username = "";
		String password = "";
		Login login = new Login(driver);		
		login.loginWithCredentials(username, password);
	}
	
}

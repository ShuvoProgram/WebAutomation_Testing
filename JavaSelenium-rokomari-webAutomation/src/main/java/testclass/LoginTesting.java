package testclass;

import java.time.Duration;

import org.testng.annotations.Test;

import Page.LoginPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class LoginTesting extends DriverSetup{
	
	LoginPage lTPobj = new LoginPage();
	
	@Test(description = "Login Testing")
	@Description("Login Testing --Allure")
	public void loginTesting() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://www.rokomari.com/book");
		lTPobj.takeScreenShot("Login testing Page");
		lTPobj.clickOnElement(lTPobj.signinIcon);
		
		lTPobj.write(lTPobj.emailOrPhn, "21345");
		lTPobj.write(lTPobj.password, "acvbn");
		
		
		
	}
	
}

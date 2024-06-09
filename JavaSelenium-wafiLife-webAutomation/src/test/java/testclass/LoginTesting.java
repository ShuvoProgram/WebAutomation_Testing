package testclass;

import org.testng.annotations.Test;

import Page.LoginPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class LoginTesting extends DriverSetup{
	
	LoginPage lPObj = new LoginPage();
	
	@Test (description = "LOgin Testing")
	@Description("Login Testing --Allure")
	public void loginTesting() throws InterruptedException {
		getDriver().get("https://www.wafilife.com/");
		lPObj.takeScreenShot("Login Page");
		lPObj.clickOnElement(lPObj.loginSingn);
		lPObj.write(lPObj.userName, "mdtauhi1@gmail.com");
		lPObj.write(lPObj.password, "amimBhuiy");
		Thread.sleep(2000);
		lPObj.clickOnElement(lPObj.signin);
	}
}

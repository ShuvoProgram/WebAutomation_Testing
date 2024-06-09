package testclass;

import org.testng.annotations.Test;

import Page.SignUpPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class SignUpTesting extends DriverSetup{
	
	SignUpPage sUPObj = new SignUpPage();
	
	@Test (description = "Signup Testing")
	@Description("Signup Testing --Allure")
	public void signupTesting() {
		getDriver().get("https://www.wafilife.com/");
		sUPObj.clickOnElement(sUPObj.signup);
		sUPObj.takeScreenShot("Signup Page");
		sUPObj.write(sUPObj.name, "Tamim Bhuiyan");
		sUPObj.write(sUPObj.phn, "093488448");
		sUPObj.write(sUPObj.email, "mdtau1@gmail.com");
		sUPObj.write(sUPObj.password, "amimBuiyan");
		sUPObj.write(sUPObj.confirmPass, "amimBuiyan");
		
		sUPObj.clickOnElement(sUPObj.registration);
	}

}

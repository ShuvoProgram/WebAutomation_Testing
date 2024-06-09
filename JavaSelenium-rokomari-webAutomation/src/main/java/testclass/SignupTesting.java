package testclass;

import org.testng.annotations.Test;

import Page.SignupPage;
import utilities.DriverSetup;

public class SignupTesting extends DriverSetup{
	
	SignupPage sPObj = new SignupPage();
	
	@Test
	public void signupTesting() {
		getDriver().get("https://www.rokomari.com/book");
		sPObj.clickOnElement(sPObj.signinButton);
		sPObj.clickOnElement(sPObj.signuNow);
		sPObj.clickOnElement(sPObj.googlesignIn);
		getDriver().navigate().back();
		
		sPObj.clickOnElement(sPObj.signuNow);
		sPObj.clickOnElement(sPObj.facebookSignin);
		getDriver().navigate().back();
		
		sPObj.clickOnElement(sPObj.signuNow);
		sPObj.write(sPObj.name, "Tamim Bhuiyan");
		sPObj.write(sPObj.email, "mdtauhidul1@gmail.com");
		sPObj.write(sPObj.phn, "09876");
		sPObj.write(sPObj.password, "amimhuiyan");
		
	}
	
}

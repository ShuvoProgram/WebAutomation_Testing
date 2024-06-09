package testclass;

import org.testng.annotations.Test;

import Page.ViewCartPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class ViewCartTesting extends DriverSetup{
	
ViewCartPage vCPObj = new ViewCartPage();
	
	@Test (description = "Cart View Testing")
	@Description("Cart View Testing --Allure")
	public void viewCartTesting() {
		getDriver().get("https://www.wafilife.com/");
		
		vCPObj.takeScreenShot("Cart View Page");
		vCPObj.clickOnElement(vCPObj.cartClick);
	}
}

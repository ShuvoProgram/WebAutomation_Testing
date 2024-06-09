package testclass;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.HoverNavbarPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class HoverNavbarTesting extends DriverSetup{
HoverNavbarPage hNPObj = new HoverNavbarPage();
	
	@Test (description = "Hover Testing")
	@Description("Hover Testing --Allure")
	public void hoverTesting() throws InterruptedException {
		
		getDriver().get("https://www.wafilife.com/");
		
		Actions action = new Actions(getDriver());
		hNPObj.takeScreenShot("Navbar Hover Page");
		action.moveToElement(hNPObj.getElement(hNPObj.home));
		
	    action.moveToElement(hNPObj.getElement(hNPObj.boi)).perform();

	
        action.moveToElement(hNPObj.getElement(hNPObj.generalBoi)).perform();


		action.moveToElement(hNPObj.getElement(hNPObj.bisoy)).perform();

		action.moveToElement(hNPObj.getElement(hNPObj.writter)).perform();

	}
}

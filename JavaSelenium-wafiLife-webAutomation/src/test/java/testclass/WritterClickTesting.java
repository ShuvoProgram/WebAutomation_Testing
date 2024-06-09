package testclass;

import org.testng.annotations.Test;
import Page.WritterClickPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class WritterClickTesting extends DriverSetup{
	WritterClickPage wCPObj = new WritterClickPage();
	
	@Test (description = "Writter Click Testing")
	@Description("Writter Click Testing --Allure")
	public void writterClick() throws InterruptedException {
		getDriver().get("https://www.wafilife.com/");
		wCPObj.takeScreenShot("Writter Page");
		wCPObj.clickOnElement(wCPObj.writterClick);
		wCPObj.clickOnElement(wCPObj.mohammadMoniruzzaman);
		wCPObj.clickOnElement(wCPObj.bookClick);
		
		Thread.sleep(2000);
		
	}
}

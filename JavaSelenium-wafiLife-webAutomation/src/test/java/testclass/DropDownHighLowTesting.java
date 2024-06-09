package testclass;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page.DropDownHighLowPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class DropDownHighLowTesting extends DriverSetup{
	
	DropDownHighLowPage dDHLObj = new DropDownHighLowPage();
	
	@Test (description = "Drop Wdown Testing")
	@Description("Drop Down Testing --Allure")
	public void dropDownTesting() throws InterruptedException {
		getDriver().get("https://www.wafilife.com/");
		dDHLObj.clickOnElement(dDHLObj.writterClick);
		dDHLObj.clickOnElement(dDHLObj.mohammadMoniruzzaman);
		dDHLObj.takeScreenShot("Drop Down Page");
		
		Select select = new Select(dDHLObj.getElement(dDHLObj.selectClick));
	
		select.selectByIndex(2);
		Thread.sleep(2000);
		
	}
}

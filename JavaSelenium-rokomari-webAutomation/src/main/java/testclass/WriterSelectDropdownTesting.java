package testclass;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.WriterSelectDropdownPage;
import utilities.DriverSetup;

public class WriterSelectDropdownTesting extends DriverSetup{
	
	WriterSelectDropdownPage wSDPObj = new WriterSelectDropdownPage(); 
	
	@Test
	public void writerSelectDropDown() throws InterruptedException {
		//getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://www.rokomari.com/book");
		
		Actions action = new Actions(getDriver());
		
		Thread.sleep(3000);
		action.moveToElement(wSDPObj.getElement(wSDPObj.hoverWriter)).perform();
		Thread.sleep(3000);
		wSDPObj.clickOnElement(wSDPObj.humayonAhmed);
		Thread.sleep(3000);
		//wSDPObj.clickOnElement(wSDPObj.somokalinUponnash);
	
		
		
		
	}
}

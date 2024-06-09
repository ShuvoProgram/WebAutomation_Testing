package testclass;

import org.testng.annotations.Test;

import Page.BookViewPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class BookViewTesting extends DriverSetup{
	
	
	BookViewPage bVPObj = new BookViewPage();
	
	@Test (description = "Book View Testing")
	@Description("Book View Testing --Allure")
	public void bookViewTesting() {
		getDriver().get("https://www.wafilife.com/");
		bVPObj.takeScreenShot("Book View Page");
		bVPObj.clickOnElement(bVPObj.boi);
		bVPObj.clickOnElement(bVPObj.okkhorPotro);
		bVPObj.clickOnElement(bVPObj.uchhomaddomik);
		bVPObj.clickOnElement(bVPObj.bookView);
		bVPObj.clickOnElement(bVPObj.orderClick);
		
		
		
	}
}

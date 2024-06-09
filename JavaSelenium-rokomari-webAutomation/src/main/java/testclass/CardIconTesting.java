package testclass;

import org.testng.annotations.Test;

import Page.CardIconPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class CardIconTesting extends DriverSetup{
 
	CardIconPage cIPObj = new CardIconPage();
	
	@Test(description = "Card Icon Testing")
	@Description("Card Icon Button Testing --Allure")
	public void cardIconTesting() {
		
		getDriver().get("https://www.rokomari.com/book");
		
		cIPObj.takeScreenShot("Book Add Card Page");
		cIPObj.clickOnElement(cIPObj.cardIcon);
		cIPObj.clickOnElement(cIPObj.continueShipping);
		getDriver().navigate().back();
		getDriver().navigate().forward();
	
		
	}
}

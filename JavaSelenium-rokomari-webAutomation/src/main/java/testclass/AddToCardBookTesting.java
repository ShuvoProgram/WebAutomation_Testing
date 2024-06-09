package testclass;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.AddToCardBookPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class AddToCardBookTesting extends DriverSetup{
	AddToCardBookPage	aTCTObj = new AddToCardBookPage();
	
	@Test (description = "Book add into card Testing")
	@Description("Any Book add into card Testing --Allure")
	public void addBookCardProcess() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().get("https://www.rokomari.com/book");
		
		Actions action = new Actions(getDriver());
		  action.moveToElement(aTCTObj.getElement(aTCTObj.hoverWriterName)).perform();
		  aTCTObj.takeScreenShot("Book Add Card Page");
		  aTCTObj.clickOnElement(aTCTObj.jaforIqbal);
		  
		  action.moveToElement(aTCTObj.getElement(aTCTObj.bookHover)).perform();
		  aTCTObj.clickOnElement(aTCTObj.bookHover);
		  getDriver().switchTo().newWindow(WindowType.TAB);
		  getDriver().get("https://www.rokomari.com/book/179466/ek-dozen-ekjon");
		  aTCTObj.clickOnElement(aTCTObj.addCard);
		  
		  
		  
		
	}
	
	
}

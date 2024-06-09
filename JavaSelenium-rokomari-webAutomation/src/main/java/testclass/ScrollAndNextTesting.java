package testclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Page.ScrollAndNextPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class ScrollAndNextTesting extends DriverSetup{
	
  ScrollAndNextPage	sANTObj = new ScrollAndNextPage();
  
    @Test(description = "Writer Page Testing")
	@Description("Writer Page Testing --Allure")
  public void scrollAndNextpageTesting() throws InterruptedException {
	  getDriver().get("https://www.rokomari.com/book");
	 
	  Actions action = new Actions(getDriver());
	  action.moveToElement(sANTObj.getElement(sANTObj.hoverWriter)).perform();
	  sANTObj.clickOnElement(sANTObj.jaforIqbal);
	  sANTObj.takeScreenShot("Writer PageTesting");
	  WebElement elementScroll = sANTObj.getElement(sANTObj.bigBank);
	  ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", elementScroll);
		Thread.sleep(3000);
		sANTObj.clickOnElement(sANTObj.nextPage);
		
  }
}

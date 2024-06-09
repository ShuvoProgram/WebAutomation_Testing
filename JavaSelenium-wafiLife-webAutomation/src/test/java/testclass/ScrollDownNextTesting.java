package testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Page.ScrollDownNextPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class ScrollDownNextTesting extends DriverSetup{
	
	ScrollDownNextPage sDPObj = new ScrollDownNextPage();
	
	@Test (description = "Scroll Testing")
	@Description("Scroll Testing --Allure")
	public void scrollDownAndNext() throws InterruptedException {
		getDriver().get("https://www.wafilife.com/");
		sDPObj.takeScreenShot("Scroll Page");
		sDPObj.clickOnElement(sDPObj.writterClick);
		WebElement ele = getDriver().findElement(By.xpath("//a[contains(text(),'→')]"));
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(2000);
		sDPObj.clickOnElement(sDPObj.nextPage);
		Thread.sleep(2000);
		getDriver().navigate().back();
	}
}

package Page;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;
import utilities.DriverSetup;

public class BasePage extends DriverSetup{
	
	String baseUrl="https://www.rokomari.com/book";
	public WebElement getElement(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void clickOnElement(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		//WebElement element =getDriver().findElement(locator);
		element.click();
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public void write(By locator, String text) {
		getElement(locator).sendKeys(text);
		
	}
	
	public void waitForElementVisiable(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
}

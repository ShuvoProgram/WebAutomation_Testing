package testclass;

import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page.OrderInfoPage;
import io.qameta.allure.Description;
import utilities.DriverSetup;

public class OrderInfoTesting extends DriverSetup{
	
OrderInfoPage oIPObj = new OrderInfoPage();
	
	@Test (description = "Order Info Testing")
	@Description("Order Info Testing --Allure")
	public void orderInfoTesting() throws InterruptedException {
		
		getDriver().get("https://www.wafilife.com/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		oIPObj.takeScreenShot("Order info Page");
		oIPObj.clickOnElement(oIPObj.sokolBisoy);
		oIPObj.clickOnElement(oIPObj.attosoddi);
		oIPObj.clickOnElement(oIPObj.onoj);
		oIPObj.clickOnElement(oIPObj.bookClick);
		oIPObj.clickOnElement(oIPObj.orderClick);
		oIPObj.clickOnElement(oIPObj.orderComplete);
		
		oIPObj.write(oIPObj.nam, "Tamim Kha");
		oIPObj.write(oIPObj.phn, "09876");
		oIPObj.write(oIPObj.emerPhn, "09856");
		oIPObj.write(oIPObj.email, "mdtsd@gmail.om");
		oIPObj.clickOnElement(oIPObj.jila);
		oIPObj.clickOnElement(oIPObj.faridpur);
		
		Select select = new Select(oIPObj.getElement(oIPObj.upojila));
		select.selectByIndex(3);
		
		oIPObj.write(oIPObj.addres, "Dhaka, abc, kbl");
		oIPObj.write(oIPObj.extraInfo, "I am testing Software");
		
	}
}

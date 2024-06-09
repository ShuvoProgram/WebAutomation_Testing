package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OTAPortal extends Base{
	

	public String url="https://dhiofur.texrootsourcing.com/";
	
	@BeforeTest
	public void baseDomain() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void otaPortalTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='OTA Portal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]")).click();
		Thread.sleep(2000);
	}

}

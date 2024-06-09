package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OurConcern extends Base{
	public String url="https://dhiofur.texrootsourcing.com/";
	
	@BeforeTest
	public void baseDomain() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void ourConcern() throws InterruptedException{
		//click the ourConcern option
		WebElement ourConcern=driver.findElement(By.xpath("//span[text()='Our Concern'][1]"));
		String txt=ourConcern.getText();
		System.out.println(txt);
		ourConcern.click();
	}
	
	@Test
	public void ConcernNameReadTest() throws InterruptedException {
		WebElement concernRead=driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')][1]"));
		concernRead.click();
		Thread.sleep(5000);
	}
}

package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gallery extends Base{
	
public String url="https://dhiofur.texrootsourcing.com/";
	
	@BeforeTest
	public void baseDomain() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void GalleryTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Gallery']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='btn btn-primary'])[3]")).click();
	}

}

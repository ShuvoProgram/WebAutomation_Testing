package Test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactUs extends Base{
	
public String url="https://dhiofur.texrootsourcing.com/";
	
	@BeforeTest
	public void baseDomain() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void ContactUsTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Contact Us']")).click();
		Thread.sleep(2000);
		//fill up form data
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("iffat jahan");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("iffatjahan046@gmail.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("01753694493");
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

}

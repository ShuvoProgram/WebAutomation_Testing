package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Blog extends Base{
	
public String url="https://dhiofur.texrootsourcing.com/";
	
	@BeforeTest
	public void baseDomain() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void blogTest() throws InterruptedException {
		WebElement blog=driver.findElement(By.xpath("//span[text()='Blog'][1]"));
		blog.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='card-img-top'])[2]")).click();
	}

}

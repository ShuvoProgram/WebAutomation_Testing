package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Consultancy extends Base {
	
public String url="https://dhiofur.texrootsourcing.com/";
	
	@BeforeTest
	public void baseDomain() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void consultancyTest() throws InterruptedException {
		WebElement consult=driver.findElement(By.xpath("//span[text()='Consultancy']"));
		Actions actionconsult=new Actions(driver);
		actionconsult.moveToElement(consult).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Immigration']")).click();
		Thread.sleep(2000);
		
	}

}

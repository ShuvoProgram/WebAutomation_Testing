package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Service extends Base{
	
	public String url="https://dhiofur.texrootsourcing.com/";
	public String url2="https://dhiofur.texrootsourcing.com/service/package-tour";
	
	@Test
	public void ServiceTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//hover and click
		Actions newAction=new Actions(driver);
		WebElement service=driver.findElement(By.xpath("//span[text()='Services']"));
		newAction.moveToElement(service).perform();
		Thread.sleep(2000);
		WebElement pacTour=driver.findElement(By.xpath("(//ul[@class='submenu']//span)[2]"));
		newAction.moveToElement(pacTour).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void packTourTest() throws InterruptedException {
		driver.navigate().to(url2);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement getQuery=driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]"));
		getQuery.click();
		Thread.sleep(5000);
		WebElement review=driver.findElement(By.id("profile-tab"));
		review.click();
		Thread.sleep(5000);
		
		//fill up with valid data on the review form
		WebElement name=driver.findElement(By.xpath("//input[@class='form-control']"));
		name.sendKeys("iffat jahan suchi");
		WebElement email=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		email.sendKeys("iffatjahan046@gmail.com");
		WebElement msg=driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		msg.sendKeys("well service provider");
		driver.findElement(By.xpath("//div[@class='review-btn']//a[1]")).click();
		Thread.sleep(5000);
		
		
	}

}

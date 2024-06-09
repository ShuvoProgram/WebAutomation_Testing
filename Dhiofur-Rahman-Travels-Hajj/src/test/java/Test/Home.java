package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Home extends Base{
	
	public String url="https://dhiofur.texrootsourcing.com/";
	
	
	@Test(priority=0)
	public void homePageTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//span[text()='Home']"));
		element.click();
		
		//soft assertion
		String ExpectedTitle="Home page -Dhiofur";
		String Actualtitle=driver.getTitle();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(Actualtitle, ExpectedTitle);
	}
	
	@Test(priority=1)
	
	public void homeMiddle() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//scrolling
		WebElement target=driver.findElement(By.xpath("(//div[@class='why_choose_title'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(target).perform();
		Thread.sleep(3000);
		
		//visa processing view more button click
		WebElement button=driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]"));
		button.click();
		Thread.sleep(4000);
		
	}
	

}

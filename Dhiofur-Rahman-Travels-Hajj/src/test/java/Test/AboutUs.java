package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class AboutUs extends Base{
	public String url="https://dhiofur.texrootsourcing.com/";
	WebElement aboutUs;
	WebElement viewAllBtn;
	@Test
	public void aboutUsTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		aboutUs=driver.findElement(By.xpath("(//nav[contains(@class,'main-menu collapse')]//span)[2]"));
		aboutUs.click();
		viewAllBtn=driver.findElement(By.id("rmjs-1"));
		Thread.sleep(3000);
		viewAllBtn.click();
		
		
	}

}

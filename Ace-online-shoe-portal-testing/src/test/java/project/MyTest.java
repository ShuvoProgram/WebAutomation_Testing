package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MyTest {
	WebDriver driver;
	@BeforeMethod
	public void b4Method() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		Thread.sleep(2000);
	}
	@Test
	public void teststeps() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("usr")).sendKeys("sa");
		driver.findElement(By.id("pwd")).sendKeys("sa");
		driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
		Thread.sleep(2000);
		WebElement webElement = driver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
		String actualFirstCategory = webElement.getText();
		String ExpectedFirstCategory = "Formal Shoes";
		Assert.assertEquals(actualFirstCategory, ExpectedFirstCategory);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void tearDown() {
	    driver.close();
	}
}

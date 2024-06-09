package Page;

import org.openqa.selenium.By;

public class HoverNavbarPage extends BasePage{
	public By home = By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]");
	public By boi = By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]");
	public By generalBoi = By.xpath("//span[contains(text(),'জেনারেল বই')]");
	public By bisoy = By.xpath("//span[contains(text(),'বিষয়')]");
	public By writter = By.xpath("//span[contains(text(),'লেখক')]");

}

package Page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public By loginSingn = By.xpath("//a[@title=\"আমার অ্যাকাউন্ট\"]");
	public By userName = By.xpath("//input[@id=\"username\"]");
	public By password = By.xpath("//input[@id=\"password\"]");
	public By signin = By.xpath("//input[@value=\"লগইন\"]");
}

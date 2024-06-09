package Page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public By signinIcon = By.xpath("//a[@class=\"logged-out-user-menu-btn btn btn-secondary\"]");
	public By emailOrPhn = By.xpath("//input[@id=\"j_username\"]");
	public By password = By.xpath("//input[@id=\"j_password\"]");
	public By signinButton = By.xpath("//button[contains(text(),'Sign In')]");
	
}

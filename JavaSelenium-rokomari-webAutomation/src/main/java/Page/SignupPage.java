package Page;

import org.openqa.selenium.By;

public class SignupPage extends BasePage{
	
	public By signinButton = By.xpath("//a[contains(text(),' Sign in ')]");
	public By signuNow = By.xpath("//p[contains(text(),'Sign up')]");
	public By googlesignIn = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[3]/div[1]/div[1]/button[2]");
	public By facebookSignin = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[3]/div[1]/div[1]/button[1]");
	
	public By name = By.xpath("//input[@id=\"nm\"]");
	public By email = By.xpath("//input[@id=\"js-email\"]");
	public By phn = By.xpath("//input[@id=\"js-phone\"]");
	public By password = By.xpath("//input[@id=\"pwd\"]");
	
}

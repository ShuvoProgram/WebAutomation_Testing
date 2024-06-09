package Page;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage{
	public By signup= By.xpath("//a[contains(text(),'            লগইন / রেজিস্টার        ') and @title=\"আমার অ্যাকাউন্ট\" ]");
	public By name = By.xpath("//input[@id=\"reg_billing_first_name\"]");
	public By phn = By.xpath("//input[@id=\"reg_billing_phone\"]");
	public By email = By.xpath("//input[@id=\"reg_email\"]");
	public By password = By.xpath("//input[@id=\"reg_password\"]");
	public By confirmPass = By.xpath("//input[@id=\"reg_confirm_password\"]");
	public By registration = By.xpath("//input[@value=\"রেজিস্টার\"]");
	

}

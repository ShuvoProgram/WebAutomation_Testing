package Page;

import org.openqa.selenium.By;

public class OrderInfoPage extends BasePage{
	
	public By sokolBisoy = By.xpath("//a[contains(text(),'সকল বিষয়')]");
	public By attosoddi = By.xpath("//h3[contains(text(),'আত্মশুদ্ধি ও অনুপ্রেরণা')]");
	public By onoj = By.xpath("//div[@id='product_cat_str:অনুজ প্রকাশন']");
	public By bookClick = By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]/div[2]/img[1]");
	public By orderClick = By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[2]");
	public By orderComplete = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
	
	public By nam = By.xpath("//input[@id='billing_first_name']");
	public By phn = By.xpath("//input[@id='billing_phone']");
	public By emerPhn = By.xpath("//input[@id='billing_alternative_phone']");
	public By email = By.xpath("//input[@id='billing_email']");
	public By jila = By.xpath("//span[@id='select2-billing_state-container']");
	public By faridpur = By.xpath("//span[@id='select2-billing_state-container']");
	public By upojila = By.xpath("//select[@id='billing_area']");
	public By addres = By.xpath("//textarea[@id='billing_address_1']");
	public By extraInfo = By.xpath("//textarea[@id='order_comments']");
	
}

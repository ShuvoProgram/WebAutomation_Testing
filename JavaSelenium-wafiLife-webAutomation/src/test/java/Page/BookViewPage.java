package Page;

import org.openqa.selenium.By;

public class BookViewPage extends BasePage{
	public By boi = By.xpath("//span[contains(text(),'প্রকাশক')]");
	public By okkhorPotro = By.xpath("//h3[contains(text(),'অক্ষরপত্র প্রকাশনী ')]");
	public By uchhomaddomik = By.xpath("//div[contains(text(),'উচ্চ মাধ্যমিক অর্থনীতি (2)')]");
	public By bookView = By.xpath("//img[@title=\"অর্থনীতি---২য়-পত্র-(একাদশ-দ্বাদশ-শ্রেণি)\"]");
	public By orderClick = By.xpath("//button[contains(text(),'অর্ডার করুন') and @class=\"single_add_to_cart_button button alt \"]");
}

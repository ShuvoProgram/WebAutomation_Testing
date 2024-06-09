package Page;

import org.openqa.selenium.By;

public class ScrollAndNextPage extends BasePage{
//	public By hoverWriter=By.xpath("//a[@id='js--authors']");
//	public By humayonAhmed = By.xpath("//a[@href=\"/book/author/1?ref=mm_p0\"]");
//	public By pilayBook = By.xpath("//img[@alt=\"Piply Begum\"]");
//	public By nextPage = By.xpath("//a[contains(text(),'Next')]");
	
	public By hoverWriter=By.xpath("//a[@id='js--authors']");
	public By jaforIqbal = By.xpath("//a[@href=\"/book/author/93?ref=mm_p1\"]");
	public By bigBank = By.xpath("//p[contains(text(),'বিগ ব্যাং থেকে হোমো স্যাপিয়েনস')]");
	public By nextPage = By.xpath("//a[contains(text(),'Next') and @href=\"/book/author/93/muhammod-zafar-iqbal?ref=mm_p1&page=2\"]");
}

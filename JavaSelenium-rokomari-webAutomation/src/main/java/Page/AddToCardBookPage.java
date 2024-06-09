package Page;

import org.openqa.selenium.By;

public class AddToCardBookPage extends BasePage{
	public By hoverWriterName=By.xpath("//a[@id='js--authors']");
	public By jaforIqbal = By.xpath("//a[contains(text(),' মুহম্মদ জাফর ইকবাল ')]");
	public By bookHover = By.xpath("//img[@alt=\"Ek Dozen Ekjon\"]");
	public By addCard = By.xpath("//a[@product-id=\"179466\" and @class=\"btn details-cart-btn small-cart-button js--add-to-cart js--add-to-cart-desc\"]");
	
}

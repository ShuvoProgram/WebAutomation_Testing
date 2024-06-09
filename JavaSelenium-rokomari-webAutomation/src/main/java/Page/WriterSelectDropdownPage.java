package Page;

import org.openqa.selenium.By;

public class WriterSelectDropdownPage extends BasePage{
	public By hoverWriter=By.xpath("//a[@id='js--authors']");
	public By humayonAhmed = By.xpath("//a[@href=\"/book/author/1?ref=mm_p0\"]");
	public By somokalinUponnash = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");

}

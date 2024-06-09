package Blueprints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Purchase {
    WebDriver driver;
    @FindBy(css = "img")
    List<WebElement> image;
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    WebElement addCart;
    @FindBy(xpath = "//a[contains(text(),\"View cart\")]")
    List<WebElement> checkCart;
    @FindBy(xpath = "//a[contains(text(),\"Proceed to checkout\")]")
    WebElement checkout;
    @FindBy(name = "product_cat")
    WebElement dropdown;
    @FindBy(className = "fa-search")
    WebElement search;
    public Purchase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void chooseProduct() throws InterruptedException {
        image.get(2).click();
        Thread.sleep(5000);
        Select s = new Select(dropdown);
        s.selectByIndex(3);
        search.click();
        image.get(2).click();
    }
    public void addToCart() throws InterruptedException {
        Thread.sleep(5000);
        addCart.click();
        Thread.sleep(5000);
        checkCart.get(2).click();
        Thread.sleep(5000);
        checkout.click();
    }


}



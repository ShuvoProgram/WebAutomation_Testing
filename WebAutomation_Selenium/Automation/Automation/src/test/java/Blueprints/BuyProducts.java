package Blueprints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BuyProducts {

        WebDriver driver;
        @FindBy(xpath = "//a[contains(text(),'Shop')]")
        WebElement shop;
        @FindBy(xpath = "//h1[contains(text(),'Shop')]")
        WebElement shopText;
        @FindBy(className = "select2-search__field")
        WebElement SearchByColor;
        @FindBy(xpath = "//button[contains(text(),'Apply')]")
        WebElement apply;
        @FindBy(xpath = "//li[contains(text(),'White')]")
        WebElement whiteColor;
        @FindBy(xpath = "//h2[contains(text(),'Black pants')]")
        WebElement whiteProduct;

        public BuyProducts(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void ClickOnShop(){
            shop.click();
            String title = shopText.getText();
            Assert.assertEquals(title,"Shop");
        }

        public void searchProductByValidColor() throws InterruptedException {
            shop.click();
            SearchByColor.click();
            whiteColor.click();
            Thread.sleep(3000);
            apply.click();
            String p = whiteProduct.getText();
            Assert.assertEquals(p,"Black pants");
        }
}

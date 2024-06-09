package Test;

import BaseDriver.BaseDriver;
import Blueprints.BuyProducts;
import Blueprints.Purchase;
import org.testng.annotations.Test;

public class BuyProductsTest extends BaseDriver {

    @Test(priority=0)
    public void ClickOnShopTab() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        BuyProducts shop = new BuyProducts(driver);
        shop.ClickOnShop();
    }

    @Test(priority=1)
    public void SelectTheValidColor() throws InterruptedException {
        BuyProducts shop = new BuyProducts(driver);
        shop.searchProductByValidColor();
    }

}

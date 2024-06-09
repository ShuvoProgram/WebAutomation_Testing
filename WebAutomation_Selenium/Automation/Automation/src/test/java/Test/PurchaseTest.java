package Test;

import BaseDriver.BaseDriver;
import Blueprints.Purchase;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseDriver {
    @Test( priority=0 )
    public void chooseTheProduct() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        Purchase purchase = new Purchase(driver);
        purchase.chooseProduct();
    }
    @Test( priority=1 )
    public void addToCart() throws InterruptedException {
        Purchase purchase = new Purchase(driver);
        purchase.addToCart();
    }
}

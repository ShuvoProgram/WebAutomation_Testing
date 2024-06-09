package Test;

import BaseDriver.BaseDriver;
import Blueprints.Login;
//import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends BaseDriver {

    @Test
    public void UserLogin() throws InterruptedException, IOException {
        driver.get("https://demo.nopcommerce.com/");
        Login login = new Login(driver);
        login.validLogin("testuser097@gmail.com", "548795");
    }
    @Test
    public void loginWithInvalidEmail() throws InterruptedException, IOException {
        driver.get("https://demo.nopcommerce.com/");
        Login login = new Login(driver);
        login.validLogin("testuser58@test.com", "548795");
    }
    @Test
    public void loginWithWrongPassword() throws InterruptedException, IOException{
        driver.get("https://demo.nopcommerce.com/");
        Login login = new Login(driver);
        login.validLogin("testuser9779@test.com", "658");
    }

}

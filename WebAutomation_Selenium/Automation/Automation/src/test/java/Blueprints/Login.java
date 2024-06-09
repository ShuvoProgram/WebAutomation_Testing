package Blueprints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(className = "ico-login")
    WebElement login;
    @FindBy(id = "Email")
    WebElement email1;
    @FindBy(id = "Password")
    WebElement password1;
    @FindBy(className = "login-button")
    WebElement buttonLogin;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void validLogin(String email, String password) throws InterruptedException {
        login.click();
        email1.sendKeys(email);
        password1.sendKeys(password);
        buttonLogin.click();
        Thread.sleep(5000);
    }
    public void invalidEmail(String email, String password) throws InterruptedException {
        login.click();
        email1.sendKeys(email);
        password1.sendKeys(password);
        buttonLogin.click();
    }
    public void invalidPassword(String email, String password) throws InterruptedException {
        login.click();
        email1.sendKeys(email);
        password1.sendKeys(password);
        buttonLogin.click();
    }
}



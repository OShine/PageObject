package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage setLoginInput(String login) {
       driver.findElement(By.id("mailbox__login")).sendKeys(login);
       return this;
    }

    public MainPage setPasswordInput(String password) {
        driver.findElement(By.id("mailbox__password")).sendKeys(password);
        return this;
    }

    public MainPage clickLoginButton() {
        driver.findElement(By.id("mailbox__auth__button")).click();
        return this;
    }
}

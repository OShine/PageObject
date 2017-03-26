package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginInput() {
        return driver.findElement(By.id("mailbox__login"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.id("mailbox__password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("mailbox__auth__button"));
    }
}

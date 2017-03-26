package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class EmailPage {
    WebDriver driver;

    public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getComposeButton() {
        return driver.findElement(By.cssSelector("[data-name=\"compose\"]"));
    }
}

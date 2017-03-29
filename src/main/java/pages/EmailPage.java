package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class EmailPage {
    WebDriver driver;

    public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public EmailPage composeButtonIsDisplayed(String errorMessage) {
        Assert.assertTrue(errorMessage, driver.findElement(By.cssSelector("[data-name=\"compose\"]")).isDisplayed() );
        return this;
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class EmailPage {
    private WebDriver driver;

    private static final By COMPOSE_BUTTON = By.cssSelector("[data-name=\"compose\"]>span");

    public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getComposeButtonText() {
        return driver.findElement(COMPOSE_BUTTON).getText();
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Factory
 * Created by DenisShklyannik on 26.03.2017.
 */
public class EmailPage {

    private WebDriver driver;

    public EmailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "[data-name=\"compose\"]>span")
    private WebElement composeButton;

    @FindBy(css = "#PH_logoutLink")
    private WebElement logoutButton;

    public String getComposeButtonText() {
        return composeButton.getText();
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }


}

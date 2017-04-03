package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Factory
 * Created by DenisShklyannik on 26.03.2017.
 */
public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "mailbox__login")
    private WebElement userName;

    @FindBy(id = "mailbox__password")
    private WebElement userPassword;

    @FindBy(id = "mailbox__auth__button")
    private WebElement authButton;

    public void setLogin(String login) {
        userName.sendKeys(login);
    }

    public void setPassword(String password) {
        userPassword.sendKeys(password);
    }

    public String getAuthButtonText() {
        return authButton.getAttribute("value");
    }

    public void clickLoginButton() {
        authButton.click();
    }

    public void loginAs(String userName, String password) {
        setLogin(userName);
        setPassword(password);
        clickLoginButton();
    }

}

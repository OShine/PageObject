import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.*;
import pages.EmailPage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;


/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class LoginTest {

    public WebDriver driver;
    public String baseURL = "https://mail.ru";
    MainPage mainPage;
    EmailPage emailPage;

    @BeforeTest
    public void beforeTest() {

        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile ffprofile = profile.getProfile("default");
        driver = new FirefoxDriver(ffprofile);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void loginTest() {

        mainPage = new MainPage(driver);
        emailPage = new EmailPage(driver);

        mainPage.setLoginInput("seleniumtests10@mail.ru");
        mainPage.setPasswordInput("060788avavav");
        mainPage.clickLoginButton();
        emailPage.composeButtonIsDisplayed("Compose button is not visible");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

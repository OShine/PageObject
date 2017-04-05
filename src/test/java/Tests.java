import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.EmailPage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

/**
 * Page Factory
 * Created by DenisShklyannik on 26.03.2017.
 */
public class Tests {

    private static WebDriver driver;
    private MainPage mainPage;
    private EmailPage emailPage;

    private static final String BASE_URL = "https://mail.ru";
    private static final String USERNAME = "seleniumtests10@mail.ru";
    private static final String PASSWORD = "060788avavav";
    private static final String COMPOSE_BUTTON_TEXT = "Написать письмо";
    private static final String AUTH_BUTTON_TEXT = "Войти";

    @BeforeTest
    public void beforeTest() {

        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile ffprofile = profile.getProfile("default");
        driver = new FirefoxDriver(ffprofile);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        mainPage = new MainPage(driver);

    }

    @Test
    public void loginTest() {
        
        emailPage = mainPage.loginAs(USERNAME, PASSWORD);
        Assert.assertEquals(emailPage.getComposeButtonText(), COMPOSE_BUTTON_TEXT);

    }

    @Test
    public void logoutTest() {

        emailPage.clickLogoutButton();
        Assert.assertEquals(mainPage.getAuthButtonText(), AUTH_BUTTON_TEXT,"Login field is not presented" );

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

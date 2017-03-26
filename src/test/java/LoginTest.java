import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmailPage;
import pages.MainPage;


/**
 * Created by DenisShklyannik on 26.03.2017.
 */
public class LoginTest {

    public WebDriver driver;
    public String baseURL = "https://mail.ru";
    MainPage mainPage;
    EmailPage emailPage;

    @BeforeMethod
    public void beforeMethod() {

        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile ffprofile = profile.getProfile("default");
        driver = new FirefoxDriver(ffprofile);

        //driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void loginTest() {

        mainPage.getLoginInput().sendKeys("seleniumtests10@mail.ru");
        mainPage.getPasswordInput().sendKeys("060788avavav");
        mainPage.getLoginButton().click();
        Assert.assertTrue(emailPage.getComposeButton().isDisplayed(),"Compose button is not visible");
    }

    @AfterMethod
    public void afterMethod() {

        driver.close();
    }
}

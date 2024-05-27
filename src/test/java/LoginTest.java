
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Listeners(ExtentTestNGITestListener.class)

public class LoginTest extends Hooks {

    public LoginPage loginPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        loginPage = new LoginPage(driver);
        wait = new WebDriverWait(driver, 10);
    }
    @Test(description = "Checking the login functionality")
    public void loginTest() throws InterruptedException {
        ExtentTestNGITestListener.getTest().log(Status.INFO, "Logging in using username dino and password choochoo");
        loginPage.clickLoginButton();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickSignIn();
        assertEquals(loginPage.getAccount().getText(), "dino");
    }

    @Test(description = "An error occurred when logging in, because I entered the wrong password")
    public void negativeLoginTest1() throws InterruptedException {
        ExtentTestNGITestListener.getTest().log(Status.INFO, "Logging in using username dino and password incorrect");
        loginPage.clickLoginButton();
        loginPage.enterUsername();
        loginPage.setTextPasswordIncorrect();
        loginPage.clickSignIn();
        assertEquals(loginPage.getError().getText(), "Incorrect username or password!");
    }
    @Test
    public void negativeLoginTest2()throws InterruptedException {
        loginPage.clickLoggingIn();
        loginPage.setUserNameIncorrect();
        loginPage.setPasswordCorrect();
        loginPage.setLoggingIn();
        assertEquals(loginPage.getError().getText(), "Incorrect user name and password correct!.");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The user was not able to login successfully !The passed successfully");
    }
    @Test
    public void negativeLoginTest3()throws InterruptedException{
        loginPage.clickSingingIn();
        loginPage.setUserNameIncorrect();
        loginPage.setPasswordIncorrectError();
        assertEquals(loginPage.getError().getText(),"Incorrect user name and password incorrect!.");
        ExtentTestNGITestListener.getTest().log(Status.INFO," The user cannot log in because the password and name are incorrect");
    }
}

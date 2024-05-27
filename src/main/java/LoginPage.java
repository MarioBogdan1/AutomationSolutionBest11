import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy(css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginButton;

    public void clickLoginButton() {
        loginButton.click();
    }

    @FindBy(id = "user-name")
    private WebElement username;

    public void setUsername() {
        username.sendKeys("dino");
    }

    @FindBy(id = "password")
    private WebElement password;

    public void setPassword() {
        password.sendKeys("choochoo");
    }

    //btn btn-primary
    @FindBy(css = ".btn.btn-primary")
    private WebElement signIn;

    public void clickSignIn() {
        signIn.click();
    }

    @FindBy(linkText = "dino")
    private WebElement account;

    public WebElement getAccount() {
        return account;
    }

    @FindBy(css = "button")
    private WebElement getButtonLogin;

    public void clickButtonLogin() {
        loginButton.click();
    }

    @FindBy(id = "username")
    private WebElement getUsername;

    public void enterUsername() {
        username.sendKeys("dino");
    }

    @FindBy(css = ".error")
    private WebElement error;

    public WebElement getError() {
        return error;
    }

    @FindBy(id = "password")
    private WebElement getPassword;


    public void clickPassword() {
        password.sendKeys("daiana");
    }

    @FindBy(id = "password")
    private WebElement textPasswordIncorrect;

    public void setTextPasswordIncorrect() {
        textPasswordIncorrect.sendKeys("incorrect");
    }

    @FindBy(css = ".svg-inline--fa.fa-sign-in-alt fa-w-16")
    private WebElement loggingIn;

    public void clickLoggingIn() {
       loggingIn.click();
    }
  @FindBy(id=".user-name")
    private WebElement userNameIncorrect;

    public void setUserNameIncorrect(){
        userNameIncorrect.sendKeys("dina");
    }
    @FindBy(id ="password")
    private WebElement passwordCorrect;
    public void setPasswordCorrect(){
        passwordCorrect.sendKeys("choochoo");
    }
    @FindBy(css=".btn btn-primary")

    private WebElement clickLoggingIn;
     public void  setLoggingIn(){
         clickLoggingIn.click();

     }
     //**
     @FindBy(css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
     private WebElement singingIn;

    public void clickSingingIn() {
       singingIn.click();
    }

    @FindBy(id = "user-name")
    private WebElement  userNameIncorrectError;

    public void setUserNameIncorrectError() {
        userNameIncorrectError.sendKeys("dinooo");
    }

    @FindBy(id = "password")
    private WebElement passwordIncorrectError;

    public void setPasswordIncorrectError() {
        passwordIncorrectError.sendKeys("chicoo");
    }



}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckoutPage extends BasePage {

    public WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }
@FindBy(linkText = "Awesome Granite Chips")
    private WebElement awesomeChipsProduct;

    public void clickAwesomeChipsProduct(){
        awesomeChipsProduct.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x ")
    private WebElement cartIcon;

    public void clickCartIcon(){
        cartIcon.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18 ")
    private WebElement shoppingCartIcon;

    public void clickShoppingCartIcon(){
        shoppingCartIcon.click();
    }
@FindBy(css = ".btn.btn-success")
    private WebElement checkoutButton;

    public void clickCheckoutButton(){
        checkoutButton.click();
    }
    @FindBy(id = "first-name")
    private WebElement firstNameSlot;

    public void setFirstNameSlot(){
        firstNameSlot.sendKeys("Mario");
    }
@FindBy(id = "last-name")
    private WebElement lastNameSlot;

    public void setLastNameSlot(){
        lastNameSlot.sendKeys("Iancu");
    }
@FindBy(id = "address")
    private WebElement addressSlot;

    public void setAddressSlot(){
        addressSlot.sendKeys("Craiova");
    }
@FindBy(css = ".btn.btn-success")
        private WebElement continueCheckoutButton;

public void clickContinueCheckoutButton(){
    continueCheckoutButton.click();
}
@FindBy(css = ".btn.btn-success")
    private WebElement completeOrderButton;

public void clickCompleteOrderButton(){
    completeOrderButton.click();
}




}
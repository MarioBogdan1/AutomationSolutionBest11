import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class CheckoutPage extends BasePage {

    public WebDriverWait wait;

    public SoftAssert softAssert;

    public CheckoutPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
        softAssert = new SoftAssert();
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
@FindBy(css = ".text-muted")
private WebElement orderCompleteMessage;

        public WebElement getOrderCompleteMessage(){

            return orderCompleteMessage;
        }
    @FindBy(linkText = "Awesome Granite Chips")
    private WebElement awesomeChips;

    public void clickAwesomeChips(){
        awesomeChips.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x ")
    private WebElement cartIconButton;

    public void clickCartIconButton(){
        cartIconButton.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18 ")
    private WebElement shoppingCartIconButton;

    public void clickShoppingCartIconButton(){
        shoppingCartIconButton.click();
    }
@FindBy(xpath = "(//td[@class='amount'])[1]")
    private WebElement itemPride;

    public double productPrice(){
        String amountValue = itemPride.getText(); //$15.99
        String cleanAmount = amountValue.replace("$", "");
        return Double.parseDouble(cleanAmount);
    }
@FindBy(css = ".svg-inline--fa.fa-plus-circle.fa-w-16")
    private WebElement plusQuantityButton;

    public void clickPlusQuantityButton(){

        plusQuantityButton.click();
    }
@FindBy(linkText = "Awesome Metal Chair")
    private WebElement awesomeMetalChairProduct;

    public void clickAwesomeMetalChairProduct(){
        awesomeMetalChairProduct.click();
    }
@FindBy(css = ".svg-inline--fa.fa-heart.fa-w-16.fa-3x")
 private WebElement wishListHartButton;

    public void clickWishListHartButton(){
        wishListHartButton.click();
    }
    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private  WebElement shoppingCartBadge;

    public WebElement getShoopingCartBadge(){
        return shoppingCartBadge;
    }
@FindBy(css = ".svg-inline--fa.fa-heart.fa-w-16")
    private WebElement wishListHartIcon;

    public void clickWishListHartIcon(){
        wishListHartIcon.click();
    }
    public WebElement getAwesomeMetalChairProduct(){
        return awesomeMetalChairProduct;
    }
@FindBy(css = ".svg-inline--fa.fa-heart-broken.fa-w-16.fa-2x ")
    private WebElement wishListBrokenHartIcon;

    public void clickWishListBrokenHartIcon(){
        wishListBrokenHartIcon.click();
    }
@FindBy(css = ".text-muted")
    private WebElement wishListComplete;

    public WebElement getWishListComplete(){
        return wishListComplete;
    }
@FindBy(linkText = "Awesome Soft Shirt")
    private WebElement awesomeShirtProduct;

    public void clickAwesomeShirtProduct(){
        awesomeShirtProduct.click();
    }
@FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoppingCartButton;

    public void clickShoppingCartButton(){
        shoppingCartButton.click();
    }
@FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement shoppingIconButton;

    public void clickShoppingIconButton(){
        shoppingIconButton.click();
    }
@FindBy(css = ".svg-inline--fa.fa-trash.fa-w-14")
    private WebElement trashButton;

    public void clickTrashButton(){
        trashButton.click();
    }
@FindBy(linkText = "Gorgeous Soft Pizza")
    private WebElement softPizzaProduct;

    public void clickSoftPizzaProduct(){
        softPizzaProduct.click();
    }
@FindBy(css = ".svg-inline--fa.fa-heart.fa-w-16.fa-3x")
private WebElement wishListButton;

    public void clicWishListButton(){
        wishListButton.click();
    }
@FindBy(css = ".svg-inline--fa.fa-heart.fa-w-16")
    private WebElement wishListIcon;

    public void clickWishListIcon(){
        wishListIcon.click();
    }
@FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
private WebElement cartButton;

    public void clickCartButton(){
        cartButton.click();
    }
@FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
private WebElement shoppingCartIconWish;

    public void clickShoppingCartIconWish(){
        shoppingCartIconWish.click();
    }
@FindBy(css = ".btn.btn-success")
private WebElement getCheckoutButton;

public void clickGetCheckoutButton(){
    getCheckoutButton.click();
}
@FindBy(id = "first-name")
private WebElement getFirstNameSlot;

public void setGetFirstNameSlot(){

    getFirstNameSlot.sendKeys("Mario");
}
    @FindBy(id = "last-name")
    private WebElement getLastNameSlot;

    public void setGetLastNameSlot(){
        getLastNameSlot.sendKeys("Iancu");
    }
    @FindBy(id = "address")
    private WebElement getAddressSlot;

    public void setGetAddressSlot(){
        getAddressSlot.sendKeys("Craiova");
    }
    @FindBy(css = ".btn.btn-success")
    private WebElement getContinueCheckoutButton;

    public void clickGetContinueCheckoutButton(){
        getContinueCheckoutButton.click();
    }
    @FindBy(css = ".btn.btn-success")
    private WebElement getCompleteOrderButton;

    public void clickGetCompleteOrderButton(){
        getCompleteOrderButton.click();
    }
    @FindBy(css = ".text-muted")
    private WebElement getOrderCompleteMessage;

    public WebElement getOrderCompleteMessageFinal(){

        return getOrderCompleteMessage;
    }
@FindBy(css = "sort-products-select form-control form-control-sm")
    private WebElement sortProductsDropDown;

    public WebElement getSortProductsDropDown(){
        return sortProductsDropDown;
    }
    public void selectionOption(WebElement element,String option){
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }
    @FindBy(id = "input-search")
private WebElement searchBarField;

    public void enterSearchBar(){
        searchBarField.sendKeys("mouse");
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement goToHomePageButton;

    public void clickGoToHomePageButton(){
        goToHomePageButton.click();
    }
@FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    private WebElement shoppingCartMetal;

    public void clickShoppingCartMetal(){
        shoppingCartMetal.click();
    }
@FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement shoppingCartIcon2;

    public void clickShoppingCartIcon2(){
        shoppingCartIcon2.click();
    }
@FindBy(css = ".text-center")
    private WebElement finalMessage;

    public WebElement getFinalMessage(){
        return finalMessage;
    }
@FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    private WebElement shoppingCartButtonChips;

    public void clickShoppingCartButtonChips(){
        shoppingCartButtonChips.click();
    }
@FindBy(linkText = "Practical Metal Mouse")
    private WebElement metalMouseProduct;

    public void clickMetalMouseProduct(){
        metalMouseProduct.click();
    }
@FindBy(linkText = "Incredible Concrete Hat")
    private WebElement concreteHatProduct;

    public void clickConcreteHatProduct(){
        concreteHatProduct.click();
    }
@FindBy(css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();
    }
@FindBy(id = "user-name")
    private WebElement usernameField;

    public void setUsernameField(String name){
        usernameField.sendKeys(name);
    }
    @FindBy(id = "password")
    private WebElement passwordField;

    public void setPasswordField(String name ){
        passwordField.sendKeys(name);
    }
    @FindBy(css = ".btn.btn-primary")
private WebElement loginBtn;

    public void clickLoginBtn(){
        loginBtn.click();
    }

@FindBy(id = "input-search")
    private WebElement searchBar;

    public void setSearchBar(){
        searchBar.sendKeys("metal");
    }
@FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement searchButton;

    public void clickSeachButton(){
        searchButton.click();
    }

    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
private WebElement sortBar;

    public WebElement getSortBar(){
        return sortBar;
    }

public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);

}
@FindBy(linkText = "dino")
    private WebElement userLoggedIn;

    public WebElement getUserLoggedIn(){
        return userLoggedIn;
    }
@FindBy(css = ".svg-inline--fa.fa-undo.fa-w-16")
    private WebElement resetBtn;

    public void clickResetBtn(){
        resetBtn.click();
    }
@FindBy(css = ".text-muted")
    private WebElement yourCartMessage;

    public WebElement getYourCartMessage(){
        return yourCartMessage;
    }
@FindBy(css = ".text-muted")
    private WebElement wishlistMessage;

    public WebElement getWishlistMessage(){
        return wishlistMessage;
    }



}










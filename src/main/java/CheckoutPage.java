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
    private WebElement productLink;

    public void clickProductLink() {
        productLink.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement cartIcon;

    public void clickCartIcon() {
        cartIcon.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement cart;

    public void clickCart() {
        cart.click();
    }

    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement shoppingCartBadge;

    public void shoppingCartBadge() {
        shoppingCartBadge.click();
    }
    @FindBy(css = ".btn.success-checkout")
    private WebElement proceedToCheckOut;

    public void proceedToCheckOut() {
        proceedToCheckOut.click();
    }
    @FindBy(linkText = "Awesome Granite Chips")
    private WebElement addProductGraniteChipsToCartLink;

    public void clickAddProductGraniteChipsToCartLink() {
        addProductGraniteChipsToCartLink.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addProductGraniteChipsToCartButton;

    public void clickAddProductGraniteChipsToCartButton() {
        addProductGraniteChipsToCartButton.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement cartButton;

    public void clickCartButton() {
        cartButton.click();
    }

    @FindBy(xpath = "(//td(2class='anount'])[1]")
    private WebElement itemPride;

    public double productPrice() {
        String amountValue = itemPride.getText(); // $15.99
        String cleanAmountValue = amountValue.replace("$", "");
        return Double.parseDouble(cleanAmountValue);
    }
    @FindBy(css = ".svg-inline--fa.fa-plus-circle.fa-w-16")
    private WebElement plusQuantity;

    public void clickPlusQuantity() {
        plusQuantity.click();
    }

    @FindBy(linkText = "Awesome Metal Chair")
    private WebElement productSelectMetal;

    public void clickProductSelectMetal() {
        productSelectMetal.click();
    }
    @FindBy(css = ".cart.plus")
    private WebElement cartPlus;

    public void clickCartPlus() {
        cartPlus.click();
    }
    @FindBy(css = ".shopping-cart")
    private WebElement shoppingCart;

    public void clickShoppingCart() {
        shoppingCart.click();
    }
    @FindBy(css = ".btn.btn-danger")
    private WebElement continueShopping;

    public void clickContinueShopping() {
        continueShopping.click();
    }

    @FindBy(linkText = "Awesome Soft Shirt")
    private WebElement addProductSoftShirt;

    public void clickAddProductSoftShirt() {
        addProductSoftShirt.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-heart fa-w-16 fa-3x")
    private WebElement addToFavoriteButton;

    public void clickAddToFavoriteButton() {
        addToFavoriteButton.click();
    }

    @FindBy(css=".svg-inline--fa.fa-heart.fa-w-16")
    private WebElement clickButtonHeartInline;

    public void clickButtonHeartInline() {
        clickButtonHeartInline.click();
    }

    @FindBy(linkText="Gorgeous Soft Pizza")
    private WebElement addProductLinkPizza;

    public void clickAddProductLinkPizza() {
        addProductLinkPizza.click();
    }

    @FindBy(css=".fa-layers-counter.shopping_cart_badge")
    private WebElement addProductCounterShoppingCart;

    public void clickAddProductCounterShoppingCart() {
        addProductCounterShoppingCart.click();
    }

    @FindBy(css=".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addCartPlusIcon;

    public void clickAddCartPlusIcon() {
        addCartPlusIcon.click();

    }

    @FindBy(css=".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")

    private WebElement addCartPlus;

    public void clickAddCartPlus() {
        addCartPlus.click();
    }

    @FindBy(css =".btn.btn-success")
    private WebElement checkOut;

    public void clickCheckOut() {
        checkOut.click();
    }

    @FindBy(id ="first-name")
    private WebElement enterFirstname;

    public void setEnterFirstname() {
        enterFirstname.sendKeys("Daia");
    }

    @FindBy(id = "last-name")
    private WebElement enterLastName;

    public void enterLastName() {
        enterLastName.sendKeys("Daia");
    }
    @FindBy(id ="address")
    private WebElement enterAddress;

    public void getEnterAddress() {
        enterAddress.sendKeys("starda-principala");
    }
    @FindBy(css =".btn.btn.light.btn-sm")
    private WebElement searchButtonFail;
    public void clickSearchButtonFail() {
        searchButtonFail.click();
    }
    @FindBy(css = ".sort-products-select.from-control.from-control-sm")
    private WebElement sortProductsDropDown;

    public WebElement getSortProductsDropDown() {
        return sortProductsDropDown;

    }
    public void selectionOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }
    @FindBy(id = "input-search")
    private WebElement searchBarField;

    public void enterSearchBar() {
        searchBarField.sendKeys("mouse ");
    }
    @FindBy(css = ".btn.btn-light.btn-sn")
    private WebElement clickSearchLight;

    public void clickSearchLight() {
        clickSearchLight.click();

    }
    @FindBy(linkText = "Refined Frozen  Mouse ")
    private WebElement clickButtonAddToCartMouse;

    public void clickButtonAddToCartMouse() {
        clickButtonAddToCartMouse.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement addButtonShoppingToCart;
    public void clickAddButtonShoppingToCart() {
        addButtonShoppingToCart.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-trash.fa-w-14")
    private WebElement clickButtonTrash;
    public void clickButtonTrash() {
        clickButtonTrash.click();
    }
    @FindBy(linkText = "Practical Metal Mouse")
    private WebElement clickAddProductPracticalMouse;
    public void clickAddProductPracticalMouse() {
        clickAddProductPracticalMouse.click();
    }
    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement clickCounterShoppingCart;
    public void clickCounterShoppingCart() {
        clickCounterShoppingCart.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement clickToShoppingBagBrandLogo;
    public void clickToShoppingBagBrandLogo() {
        clickToShoppingBagBrandLogo.click();
    }
    //Research after dropdown from A to z.
    @FindBy(css = ".sort-products-select.from-control.from-control-sm")
    private WebElement sortProductDropDown;
    public WebElement getSortProductDropDown() {
        return sortProductDropDown;
    }
    @FindBy(css = "option[value='a-z']")
    private WebElement optionAZ;
    public WebElement getOptionAZ() {
        return optionAZ;
    }
    @FindBy(css = ".card-link")
    private WebElement addProductLicensedSteelGlovesToCartLink;

    public void clickAddProductLicensedSteelGlovesToCartLink() {
        addProductLicensedSteelGlovesToCartLink.click();
    }
    @FindBy(css = ".btn.btn-link")
    private WebElement addProductLicensedSteelGlovesToCartButton;
    public void clickAddProductLicensedSteelGLovesToCartButton() {
        addProductLicensedSteelGlovesToCartButton.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement shoppingCartButton;
    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }
    public double taxPrice() {
        String taxValue = taxPrice.getText(); // $15.99
        String cleanTaxValue = taxValue.replace("$", "");
        return Double.parseDouble(cleanTaxValue);
    }
    public double totalPrice() {
        String totalValue = totalPrice.getText(); // $15.99
        String cleanTotalValue = totalValue.replace("$", "");
        return Double.parseDouble(cleanTotalValue);
    }
    @FindBy(xpath = "(//td[@class='amount'])[2]")
    private WebElement taxPrice;
    @FindBy(xpath = "(//td[@class='amount'])[3]")
    private WebElement totalPrice;
}
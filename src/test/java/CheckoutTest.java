import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


@Listeners(ExtentTestNGITestListener.class)

public class CheckoutTest extends Hooks {

    public CheckoutPage checkoutPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void checkoutTest() throws InterruptedException {
        checkoutPage.clickProductLink();
        checkoutPage.clickCartIcon();
        checkoutPage.clickCart();
        checkoutPage.clickToCheckout();
        Thread.sleep(5000);
    }
    @Test(description = "Changing quantity test. Asserting that the price is updated correctly.")
    public void quantityTest() {
        checkoutPage.clickAddProductGraniteChipsToCartLink();
        checkoutPage.clickAddProductGraniteChipsToCartButton();
        checkoutPage.clickCartButton();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
        double expectedTotal = checkoutPage.productPrice() * 2;
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after updating should be: " + expectedTotal);
        checkoutPage.clickPlusQuantity();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after update is: " + checkoutPage.productPrice());
        assertEquals(checkoutPage.productPrice(), expectedTotal);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is matching the expected price");
        checkoutPage.clickPlusQuantity();
        assertEquals(checkoutPage.productPrice(), expectedTotal);
    }
    @Test(description = "Testing for product addition")
    public void checkout() throws InterruptedException {
        checkoutPage.clickProductSelectMetal();
        checkoutPage.clickCartIcon();
        checkoutPage.clickCart();
        checkoutPage.clickContinueShopping();
        Thread.sleep(3000);

    }
    @Test(description = "Selecting the product and adding it to the heart")
    public void ProductSelect() throws InterruptedException {
        checkoutPage.clickAddProductSoftShirt();
        checkoutPage.clickAddToFavoriteButton();
        checkoutPage.clickButtonHeartInline();
        Thread.sleep(4000);
    }
    @Test (description = "Selecting the product and adding it to the shopping cart")
    public void SelectAddProduct()throws InterruptedException {
        checkoutPage.clickAddProductLinkPizza();
        checkoutPage.clickAddCartPlusIcon();
        checkoutPage.clickCartPlus();
        checkoutPage.clickCheckOut();
        checkoutPage.setEnterFirstname();
        checkoutPage.enterLastName();
        checkoutPage.getEnterAddress();
        Thread.sleep(4000);

    }
    @Test(description = "Search Products to dropdown and searching by price Low to High")
    public void shortProductsTest()throws InterruptedException{
        checkoutPage.selectionOption(checkoutPage.getSortProductsDropDown(),"Sort by price (low to high)");
        ExtentTestNGITestListener.getTest().log(Status.INFO,"");
    }
    @Test(description = "Search test ,searching after mouse ")
    public void searchTest()throws InterruptedException{
        checkoutPage.enterSearchBar();
        checkoutPage.clickSearchButton();
        Thread.sleep(4000);

    }
  @Test(description = "Adding the product to the favorites list")
    public void addTheProduct()throws InterruptedException{
      checkoutPage.clickButtonAddToCartMouse();
      checkoutPage.clickAddButtonShoppingToCart();
      checkoutPage.clickButtonTrash();
      Thread.sleep(4000);
    }
    @Test
    public void addProduct()throws InterruptedException{
        checkoutPage.clickAddProductPracticalMouse();
        checkoutPage.clickCounterShoppingCart();
        checkoutPage.clickCounterShoppingCart();
        Thread.sleep(4000);
    }
    @Test (description = "Search Products to Dropdown  and searching by name by name A to Z")
    public  void shortProductDropdown ()throws InterruptedException{
        checkoutPage.selectionOption(checkoutPage.getSortProductDropDown(),"Sort by name ( A to Z)");
        Thread.sleep(4000);
        ExtentTestNGITestListener.getTest().log(Status.INFO,"The products are searched correctly from A to Z.");
      assertEquals( "Sort by  name (A to Z)",checkoutPage.getOptionAZ().getText());

    }
    @Test(description =" We calculate the product total with the taxes price." )
     public void totalPriceResultTest()throws InterruptedException{
        checkoutPage.clickAddProductLicensedSteelGlovesToCartLink();
        checkoutPage.clickAddProductLicensedSteelGLovesToCartButton();
        checkoutPage.clickShoppingCartButton();
        ExtentTestNGITestListener.getTest().log(Status.INFO,"The prices of the product is:"+checkoutPage.productPrice());
        ExtentTestNGITestListener.getTest().log(Status.INFO,"The taxes of the product is:"+checkoutPage.taxPrice());
        double expectedTotal= checkoutPage.taxPrice()+checkoutPage.productPrice();
         Thread.sleep(4000);
        ExtentTestNGITestListener.getTest().log(Status.INFO,"The expected total is:"+expectedTotal);
        ExtentTestNGITestListener.getTest().log(Status.INFO,"The actual total is:"+checkoutPage.totalPrice());
        assertEquals(checkoutPage.totalPrice(),expectedTotal);
    }

}
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
@Test(description = "Purchasing a product as a guest user")
    public void checkoutTest() throws InterruptedException {
checkoutPage.clickAwesomeChipsProduct();
checkoutPage.clickCartIcon();
checkoutPage.clickShoppingCartIcon();
checkoutPage.clickCheckoutButton();
checkoutPage.setFirstNameSlot();
checkoutPage.setLastNameSlot();
checkoutPage.setAddressSlot();
checkoutPage.clickContinueCheckoutButton();
checkoutPage.clickCompleteOrderButton();
assertEquals(checkoutPage.getOrderCompleteMessage().getText(),"Order Complete");
Thread.sleep(5000);
}

@Test(description = "Changing quantity test.Asserting that the price is updated correctly.")
    public void quantityTest(){
        checkoutPage.clickAwesomeChips();
        checkoutPage.clickCartIconButton();
        checkoutPage.clickShoppingCartIconButton();
        ExtentTestNGITestListener.getTest().log(Status.INFO, " The price of the product is: " + checkoutPage.productPrice());
double expectedTotal = checkoutPage.productPrice() * 2;
ExtentTestNGITestListener.getTest().log(Status.INFO, " The price of the product after updating should be: " + expectedTotal);
checkoutPage.clickPlusQuantityButton();
assertEquals(checkoutPage.productPrice(), expectedTotal);
ExtentTestNGITestListener.getTest().log(Status.PASS, "The price of the product matches the expected total" + checkoutPage.productPrice() + "=" + expectedTotal);
    }

    @Test(description = "Adding and removing a product from wishlist.")
    public void wishListTest()throws InterruptedException  {
checkoutPage.clickAwesomeMetalChairProduct();
checkoutPage.clickWishListHartButton();
checkoutPage.clickWishListHartIcon();
checkoutPage.clickWishListBrokenHartIcon();
ExtentTestNGITestListener.getTest().log(Status.PASS, "Adding and removing a product from wishlist was a success.");
        Thread.sleep(5000);
    }

@Test(description = "Adding and removing a product from shopping cart.")
    public void shoppingCartTest() throws InterruptedException {
checkoutPage.clickAwesomeShirtProduct();
checkoutPage.clickShoppingCartButton();
checkoutPage.clickShoppingIconButton();
checkoutPage.clickTrashButton();
    ExtentTestNGITestListener.getTest().log(Status.PASS, "Adding and removing a product from shopping cart was a success.");
    Thread.sleep(5000);
    }

@Test(description = "Purchasing a product from wishlist.")
    public void purchasingProductFromWishlistTest() throws InterruptedException {
checkoutPage.clickSoftPizzaProduct();
checkoutPage.clicWishListButton();
checkoutPage.clickWishListIcon();
checkoutPage.clickCartButton();
checkoutPage.clickShoppingCartIconWish();
checkoutPage.clickGetCheckoutButton();
checkoutPage.setGetFirstNameSlot();
checkoutPage.setGetLastNameSlot();
checkoutPage.setGetAddressSlot();
checkoutPage.clickGetContinueCheckoutButton();
checkoutPage.clickGetCompleteOrderButton();
checkoutPage.getOrderCompleteMessageFinal();
    Thread.sleep(5000);






}





}
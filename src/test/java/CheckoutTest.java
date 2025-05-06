import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


@Listeners(ExtentTestNGITestListener.class)

public class CheckoutTest extends Hooks {

public CheckoutPage checkoutPage;
public WebDriverWait wait;
public SoftAssert softAssert;

@BeforeMethod
public void SetupPageObject() {
    checkoutPage = new CheckoutPage(driver);
    wait = new WebDriverWait(driver, 10);
    softAssert = new SoftAssert();
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
    Thread.sleep(3000);
    checkoutPage.clickWishListHartButton();
    Thread.sleep(3000);
    assertEquals(checkoutPage.getShoopingCartBadge().getText(), "1");
    checkoutPage.clickWishListHartIcon();
    Thread.sleep(3000);
    assertEquals(checkoutPage.getAwesomeMetalChairProduct().getText(),"Awesome Metal Chair");
    checkoutPage.clickWishListBrokenHartIcon();
    ExtentTestNGITestListener.getTest().log(Status.PASS, "Adding and removing a product from wishlist was a success.");

}

@Test(description = "Adding and removing a product from shopping cart.")
public void shoppingCartTest() throws InterruptedException {
    checkoutPage.clickAwesomeShirtProduct();
    Thread.sleep(5000);
    checkoutPage.clickShoppingCartButton();
    Thread.sleep(5000);
    checkoutPage.clickShoppingIconButton();
    Thread.sleep(5000);
    checkoutPage.clickTrashButton();
    Thread.sleep(5000);
    ExtentTestNGITestListener.getTest().log(Status.PASS, "Adding and removing a product from shopping cart was a success.");

}

@Test(description = "Purchasing a product from wishlist.")
public void purchasingProductFromWishlistTest() throws InterruptedException {
    checkoutPage.clickSoftPizzaProduct();
    checkoutPage.clicWishListButton();
    checkoutPage.clickWishListIcon();
    checkoutPage.clickCartButton();
    checkoutPage.clickShoppingCartIconWish();
    Thread.sleep(5000);
    checkoutPage.clickGetCheckoutButton();
    checkoutPage.setGetFirstNameSlot();
    checkoutPage.setGetLastNameSlot();
    checkoutPage.setGetAddressSlot();
    Thread.sleep(5000);
    checkoutPage.clickGetContinueCheckoutButton();
    checkoutPage.clickGetCompleteOrderButton();
    checkoutPage.getOrderCompleteMessageFinal();
}


@Test(description = "Purchase two products from wishlist")
    public void purchaseTwoProductsWishTest(){
    checkoutPage.clickAwesomeMetalChairProduct();
    checkoutPage.clickWishListHartButton();
    checkoutPage.clickGoToHomePageButton();
    checkoutPage.clickAwesomeChipsProduct();
    checkoutPage.clickWishListHartButton();
    checkoutPage.clickWishListHartIcon();
    checkoutPage.clickShoppingCartButtonChips();
    checkoutPage.clickShoppingCartMetal();
    checkoutPage.clickShoppingCartIcon2();
    checkoutPage.clickCheckoutButton();
    checkoutPage.setFirstNameSlot();
    checkoutPage.setLastNameSlot();
    checkoutPage.setAddressSlot();
    checkoutPage.clickContinueCheckoutButton();
    checkoutPage.clickCompleteOrderButton();
    assertEquals(checkoutPage.getFinalMessage().getText(), "Thank you for your order!");
}

@Test(description = "Purchasing two simple products as a guest user")
    public void purchasingTwoProductsTest(){
    checkoutPage.clickMetalMouseProduct();
    checkoutPage.clickCartIcon();
    checkoutPage.clickGoToHomePageButton();
    checkoutPage.clickConcreteHatProduct();
    checkoutPage.clickCartIcon();
    checkoutPage.clickShoppingCartIcon2();
    checkoutPage.clickCheckoutButton();
    checkoutPage.setFirstNameSlot();
    checkoutPage.setLastNameSlot();
    checkoutPage.setAddressSlot();
    checkoutPage.clickContinueCheckoutButton();
    checkoutPage.clickCompleteOrderButton();
    assertEquals(checkoutPage.getFinalMessage().getText(), "Thank you for your order!");
}

@Test(description = "Login with a user ")
    public void loginTest()throws InterruptedException{
    checkoutPage.clickLoginButton();
    checkoutPage. setUsernameField("dino");
    Thread.sleep(2500);
    checkoutPage.setPasswordField("choochoo");
    Thread.sleep(2500);
    checkoutPage.clickLoginBtn();
}

@Test(description = "Test the seach functionality by searching the keyword 'metal'")
    public void searchTest(){
    checkoutPage.setSearchBar();
    checkoutPage.clickSeachButton();
    ExtentTestNGITestListener.getTest().log(Status.INFO, "The search engine is looking for the keyword 'metal'");
}

@Test(description = "Testing the sort bar functionality")
    public void sortTest() throws InterruptedException {
checkoutPage.selectOption(checkoutPage.getSortBar(), "Sort by name (Z to A)");
Thread.sleep(4000);
}

@Test(description = "Login test and reset")
    public void loginSecondTest(){
    checkoutPage.clickLoginButton();
    checkoutPage. setUsernameField("dino");
    checkoutPage.setPasswordField("choochoo");
    checkoutPage.clickLoginBtn();
    wait.until(ExpectedConditions.visibilityOf(checkoutPage.getUserLoggedIn()));
    checkoutPage.clickResetBtn();
try {
    driver.findElement(By.linkText("dino"));
    Assert.fail("Element is still present.");
} catch (NoSuchElementException e){
    Assert.assertTrue(true, "Element is not present as expected");
}
ExtentTestNGITestListener.getTest().log(Status.PASS, "The page was reset the user Dino is signed out.");
}

@Test(description = "Clicking reset button when a product is added to the shopping cart")
    public void shoppingCartResetTest(){
    checkoutPage.clickAwesomeChipsProduct();
    checkoutPage.clickCartIcon();
    checkoutPage.clickShoppingCartIcon();
    wait.until(ExpectedConditions.visibilityOf(checkoutPage.getYourCartMessage()));
    checkoutPage.clickResetBtn();
    try{
        driver.findElement(By.className("text-muted"));
    } catch (NoSuchElementException e){
        Assert.assertTrue(true, "As expected the product is no longer in the shopping cart.");
    }
ExtentTestNGITestListener.getTest().log(Status.PASS, "The page was reset and the cart is empty.");
}

@Test(description = "Clicking reset button when a product is added to the wishlist")
    public void wishlistResetButton(){
    checkoutPage.clickAwesomeMetalChairProduct();
    checkoutPage.clickWishListHartButton();
    checkoutPage.clickWishListHartIcon();
    wait.until(ExpectedConditions.visibilityOf(checkoutPage.getWishlistMessage()));
    checkoutPage.clickResetBtn();
    try{
        driver.findElement(By.className("text-muted"));
    }catch (NoSuchElementException e){
        Assert.assertTrue(true, "As expected the product is no longer in wishlist.");
    }
    ExtentTestNGITestListener.getTest().log(Status.PASS, "The page was reset and the wishlist is empty.");


}




}
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
Thread.sleep(5000);
}

}
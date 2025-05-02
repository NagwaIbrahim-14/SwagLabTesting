package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.CheckoutPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChectoutTest extends BaseTest {
    CheckoutPage checkoutPage;
    CartPage cartPage;
    @BeforeMethod
    public void before(){
        checkoutPage=new CheckoutPage(driver);
//        cartPage=new CartPage(driver);
        checkoutPage.viewCart();

        checkoutPage.clickCheckOut();

    }

    @AfterMethod
    public void after(){
        checkoutPage.setContinueButton();
    }
    @Test
    public void checkoutWithValidData(){
//        checkoutPage=new CheckoutPage(driver);
        checkoutPage.enterFirstName("nagwa");
        checkoutPage.enterLastName("ibrahim");
        checkoutPage.enterZipCode("123");
    }

    @Test
    public void enterFirstNameOnly(){
//        checkoutPage=new CheckoutPage(driver);
        checkoutPage.enterFirstName("nagwa");
    }

    @Test
    public void enterLasstNameOnly(){
//        checkoutPage=new CheckoutPage(driver);
        checkoutPage.enterLastName("ibrahim");
    }

    @Test
    public void enterZipOnly(){
        /* checkoutPage=new CheckoutPage(driver); */
        checkoutPage.enterZipCode("123");
    }

//    @Test
//    public void clickCancle(){
//        checkoutPage.setCancelButton();
//    }
}

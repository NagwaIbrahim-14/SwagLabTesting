package Tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.ProuductsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    CartPage cartPage;
    ProuductsPage prouductsPage;

    @BeforeMethod
    public void before(){
        cartPage=new CartPage(driver);;
        prouductsPage=new ProuductsPage(driver);
    }

    @Test(description = "Tc1 verify Checkout process from cart")
    public void Checkout() throws InterruptedException {
        cartPage.Cart();
        cartPage.checkoutButton();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-one.html"),
                "Checkout page did not open!");

    }

    @Test(description = "TC2= Verify Removing Back Bag from Cart")
    public void remove_back_bag(){
        prouductsPage.addJacket();
        prouductsPage.addBike();
        prouductsPage.addBackBag();
        int intialcount=cartPage.getCartItemCount();
        Assert.assertEquals(intialcount,3,"Intitial cart count Mismatch Found: "+intialcount);
        cartPage.rBack();

        int updatecount =waitForCartUpdate(intialcount);
        Assert.assertEquals(updatecount,2,"Item Removal Failed! Expected 2 Items but Found :"+updatecount);
    }

    private int waitForCartUpdate(int previouscount){
        int attemps=0;
        int currentcount=cartPage.getCartItemCount();
        while (currentcount==previouscount && attemps<5){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            currentcount=cartPage.getCartItemCount();
            attemps++;
        }
        return currentcount;
    }


    @Test(description = "TC3=press button to back to product page")
    public void back_to_prouducts_page() {
        prouductsPage.cart_button();
        cartPage.continueShoppingButton();
        Assert.assertTrue(prouductsPage.isOnProductPage(),"Expected to be on product page but was on"+driver.getCurrentUrl());
    }

    @Test(description = "TC4= Verify Add/Remove Items and Proceed to Checkout")
    public void Add_Remove_Checkout(){
        prouductsPage.addJacket();
        prouductsPage.addBike();
        Assert.assertEquals(cartPage.getCartItemCount(),2,"Items not Added to Cart!");

        cartPage.Cart();
        cartPage.rJacket();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        Assert.assertEquals(cartPage.getCartItemCount(),1,"Jacket Removal Failed!");

        cartPage.CheckOut();
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-one.html"),"Checkout Faild After Removal!");
    }
}

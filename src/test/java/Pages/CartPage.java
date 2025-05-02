package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
//    remove-sauce-labs-onesie

    WebDriver driver;
    WebDriverWait wait;
    public CartPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    By checkoutTextbox= By.id("checkout");
    By removeOneSie=By.id("remove-sauce-labs-onesie");
    By removeBackBag=By.id("remove-sauce-labs-backpack");
    By removeBike=By.id("remove-sauce-labs-bike-light");
    By removeJacket=By.id("remove-sauce-labs-fleece-jacket");
    By removeTShirt=By.id("remove-sauce-labs-bolt-t-shirt");
    By removeTShirtRed=By.id("remove-test.allthethings()-t-shirt-(red)");
    By cartLink=By.className("shopping_cart_link");
    By cartPadge=By.className("shopping_cart_badge");
    By ContinueShoppingButton=By.id("continue-shopping");

    public void CheckOut(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutTextbox)).click();
    }

    public void rOneSie(){
        wait.until(ExpectedConditions.elementToBeClickable(removeOneSie)).click();
    }

    public void rBack(){
        wait.until(ExpectedConditions.elementToBeClickable(removeBackBag)).click();
    }
    public void rBike(){
        wait.until(ExpectedConditions.elementToBeClickable(removeBike)).click();
    }
    public void rJacket(){
        wait.until(ExpectedConditions.elementToBeClickable(removeJacket)).click();
    }
    public void rTShirt(){
        wait.until(ExpectedConditions.elementToBeClickable(removeTShirt)).click();
    }

    public void rTShirtRed(){
        wait.until(ExpectedConditions.elementToBeClickable(removeTShirtRed)).click();
    }

    public void remove_Button(){

    }

    public void checkoutButton(){
        driver.findElement(checkoutTextbox).click();
    }

    public void continueShoppingButton(){
        driver.findElement(ContinueShoppingButton).click();
    }
    public void Cart(){
        wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
    }
    public void continueShopping(){
        wait.until(ExpectedConditions.elementToBeClickable(ContinueShoppingButton)).click();
    }

    public int getCartItemCount() {
        try {
            return Integer.parseInt(driver.findElement(cartPadge).getText());
        } catch (Exception e) {
            return 0;
        }
    }


    public void waitForCartToUpdate(int expectedCount) {
        wait.until(ExpectedConditions.textToBe(cartPadge, String.valueOf(expectedCount)));
    }

}

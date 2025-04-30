package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
//    remove-sauce-labs-onesie

    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    By checkoutTextbox= By.id("checkout");
    By ContinueShoppingButton=By.id("continue-shopping");
    public void remove_Button(){

    }

    public void checkoutButton(){
        driver.findElement(checkoutTextbox).click();
    }

    public void continueShoppingButton(){
        driver.findElement(ContinueShoppingButton).click();
    }
}

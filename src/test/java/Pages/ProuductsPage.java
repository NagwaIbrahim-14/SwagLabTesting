package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProuductsPage {
    WebDriver driver;

    public ProuductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By Bike=By.id("add-to-cart-sauce-labs-bike-light");
    By BackBag=By.id("add-to-cart-sauce-labs-backpack");
    By T_Shirts =By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By Jacket=By.id("add-to-cart-sauce-labs-fleece-jacket");
    By OneSie=By.id("add-to-cart-sauce-labs-onesie");
    By T_Shirts_Red=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By cart_button =By.className("shopping_cart_link");

    public void addBike(){
        driver.findElement(Bike).click();
    }

    public void addBackBag(){
        driver.findElement(BackBag).click();
    }

    public void addT_Shirts(){
        driver.findElement(T_Shirts).click();
    }

    public void addJacket(){
        driver.findElement(Jacket).click();
    }

    public void addOneSie(){
        driver.findElement(OneSie).click();
    }

    public void addT_Shirts_Red(){
        driver.findElement(T_Shirts_Red).click();
    }

    public void  cart_button(){
        driver.findElement(cart_button).click();
    }
    public boolean isOnProductPage() {
        try {
            // Example: Check for a product list container or a specific heading
            return driver.getCurrentUrl().contains("/inventory.html");
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}


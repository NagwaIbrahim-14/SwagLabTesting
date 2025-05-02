package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkout=By.id("checkout");
    By ViewCart=By.className("shopping_cart_link");
    By first_name_Textbox= By.id("first-name");
    By last_name_Textbox= By.id("last-name");
    By postal_code_Textbox= By.id("postal-code");
    By continueButton=By.id("continue");
    By cancelButton=By.id("cancel");

    public void clickCheckOut(){
        driver.findElement(checkout).click();
    }

    public void viewCart(){
        driver.findElement(ViewCart).click();
    }

    public void enterFirstName(String firstname){
        driver.findElement(first_name_Textbox).sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        driver.findElement(last_name_Textbox).sendKeys(lastname);
    }

    public void enterZipCode(String zip){
        driver.findElement(postal_code_Textbox).sendKeys(zip);
    }

    public void setContinueButton(){
        driver.findElement(continueButton).click();
    }

    public void setCancelButton(){
        driver.findElement(cancelButton).click();
    }


}

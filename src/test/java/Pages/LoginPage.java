package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By user_nameTextbox=By.id("user-name");
    By password_Textbox=By.id("password");
    By login_Button=By.id("login-button");


    public void navigateToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void enteruUsername(String username){
        driver.findElement(user_nameTextbox).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(password_Textbox).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(login_Button).click();
    }

}

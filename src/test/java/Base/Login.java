package Base;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {
    public static void performeValidLogin(WebDriver driver){

            LoginPage loginPage=new LoginPage(driver);
            loginPage.navigateToLoginPage();
            loginPage.enteruUsername("standard_user");
            loginPage.enterPassword("secret_sauce");
            loginPage.clickLogin();

    }
}

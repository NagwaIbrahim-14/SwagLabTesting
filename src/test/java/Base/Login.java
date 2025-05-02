package Base;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class Login {

    public void performValidLogin(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }
}


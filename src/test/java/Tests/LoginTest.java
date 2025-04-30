package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
//    private static final Logger log= LoggerFactory.getLogger(LoginTest.class);
    LoginPage loginPage;





    @Test
    public void loginWithLockOutUser(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    public void loginWithProblemUser(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("problem_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    public void loginWithPerformanceUser(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("performance_glitch_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    public void loginWithErrorUser(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("error_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    public void loginWithVisualUser(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("visual_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

//    negative scenario
    @Test
    public void logonWithEmptyData(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("");
        loginPage.enterPassword("");
        loginPage.clickLogin();
    }

    @Test
    public void logonWithWrongUsername(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("nagwa");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    public void logonWithWrongPassword(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("standard_user");
        loginPage.enterPassword("123");
        loginPage.clickLogin();
    }

    @Test
    public void logonWithInvalidCreadintials(){
        loginPage=new LoginPage(driver);
        loginPage.navigateToLoginPage();
        loginPage.enteruUsername("nagwa");
        loginPage.enterPassword("123");
        loginPage.clickLogin();
    }





}

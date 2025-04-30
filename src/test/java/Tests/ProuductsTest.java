package Tests;

import Base.BaseTest;
import Pages.ProuductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;


public class ProuductsTest extends BaseTest {

    ProuductsPage prouductsPage;

    @Test
    public void sorting_A_Z() throws InterruptedException {
        driver.findElement(By.className("product_sort_container")).click();
        WebElement DropdwonElement=driver.findElement(By.className("product_sort_container"));
        Select dropdown=new Select(DropdwonElement);
        dropdown.selectByValue("az");
        Thread.sleep(2000);
    }

    @Test
    public void sorting_Z_A() throws InterruptedException {
        driver.findElement(By.className("product_sort_container")).click();
        WebElement DropdwonElement=driver.findElement(By.className("product_sort_container"));
        Select dropdown=new Select(DropdwonElement);
        dropdown.selectByValue("za");
        Thread.sleep(2000);
    }

    @Test
    public void sorting_low_high() throws InterruptedException {
        driver.findElement(By.className("product_sort_container")).click();
        WebElement DropdwonElement=driver.findElement(By.className("product_sort_container"));
        Select dropdown=new Select(DropdwonElement);
        dropdown.selectByValue("lohi");
        Thread.sleep(2000);
    }

    @Test
    public void sorting_high_low() throws InterruptedException {
        driver.findElement(By.className("product_sort_container")).click();
        WebElement DropdwonElement=driver.findElement(By.className("product_sort_container"));
        Select dropdown=new Select(DropdwonElement);
        dropdown.selectByValue("hilo");
        Thread.sleep(2000);
    }

    @Test
    public void addBikeToCart() throws InterruptedException {
        JavascriptExecutor  js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addBike();

    }

    @Test
    public void addBackBagToCart() throws InterruptedException{
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addBackBag();
    }

    @Test
    public void addT_ShirtsToCart() throws InterruptedException{

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addT_Shirts();
    }

    @Test
    public void addJacketToCart() throws InterruptedException {

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addJacket();
    }

    @Test
    public void addOneSieToCart() throws InterruptedException {

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addOneSie();
    }

    @Test
    public void addT_Shirts_RedCart() throws InterruptedException {

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addT_Shirts_Red();
    }

    @Test
    public void addT_Items() throws InterruptedException {


        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addT_Shirts_Red();
        prouductsPage.addBike();
        prouductsPage.addJacket();

    }

    @Test
    public void remove_Items() throws InterruptedException {


        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        prouductsPage=new ProuductsPage(driver);
        prouductsPage.addBackBag();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        prouductsPage.addBike();
        Thread.sleep(5000);
        prouductsPage.addJacket();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

    }


    @Test
    public void clickCartButton() throws InterruptedException {

      driver.findElement(By.className("shopping_cart_link")).click();
      Thread.sleep(3000);
    }



}

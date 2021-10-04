package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGFrame {
    WebDriver driver =null;

       @BeforeMethod
    public void navigateGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
      //launch browser
        driver = new ChromeDriver() ;
        // maximize the browser
        // adding implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        System.out.println(" launch browser");

       }
               @Test
               public void Google() throws InterruptedException {
           driver.get("https://google.com");
           Thread.sleep(5000);


           }

    @Test
    public void Testifyltd () throws InterruptedException {
        driver.get("https://testifyltd.com/");
        // click on the Gmail and login button
        driver.findElement(By.xpath("//button[contains(text(),'login')]"));
        Thread.sleep(5000);
        System.out.println("click on login");



    }
    @AfterClass
    public void closeBrowser() {
           driver.quit();
        System.out.println("close the second browser");


    }
}

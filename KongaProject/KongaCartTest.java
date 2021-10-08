package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KongaCartTest {
    WebDriver driver = null;



    public void kongaTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        //lunch browser
        driver = new ChromeDriver();
        // maximize the browser
        driver.manage().window().maximize();
        // get the Url
        driver.get("https://www.konga.com/");
        KongaCartPage Cart = new KongaCartPage(driver);
        Cart.getaddTocart().sendKeys("10.1 Android Network Laptop");
        Thread.sleep(5000);
        Cart.getSubtotal().sendKeys("59,900");
        Thread.sleep(5000);
        Cart.getCheckout().click();
        Thread.sleep(5000);
        Cart.getSelectAddress().sendKeys("no 12,Oshinfolarin Bariga lagos");
        Thread.sleep(5000);
        Cart.getSelectLocation().sendKeys("Lagos");


    }



}

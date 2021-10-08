package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KongaLoginTest {

    WebDriver driver = null;



    public void kongaTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        //lunch browser
        driver = new ChromeDriver();
        // maximize the browser
        driver.manage().window().maximize();
        // get the Url
        driver.get("https://www.konga.com/");
        KongaLoginPage Login = new KongaLoginPage(driver);
        Login.getUsername().sendKeys("adeniyi.ademorayo@gmail.com");
        Thread.sleep(5000);
        Login.getPassword().sendKeys("adeoluwamomo");
        Thread.sleep(5000);
        Login.getLogin().click();

}

}
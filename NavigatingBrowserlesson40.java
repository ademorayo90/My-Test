package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBrowserlesson40 {
    public static void main(String []args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximize the broswer
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://saucedemo.com");
        driver.findElement(By.cssSelector("input[name=submit-button btn_action\"\n]")).sendKeys("login button");

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
        driver.navigate().back();
        Thread.sleep(5000);
    }

}

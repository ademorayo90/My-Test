package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLesson37 {
    public static void main(String[] args) throws  InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        WebDriver bag = new ChromeDriver();
        bag.get("https://www.saucedemo.com/");
        bag.findElement(By.cssSelector("input[id=user-name ]")).sendKeys("standard_user");
        Thread.sleep(5000);
        bag.findElement(By.cssSelector("input[id= password ]")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        bag.findElement(By. cssSelector("input[id= login-button ]")).click();
        Thread.sleep(5000);
        bag.findElement(By. cssSelector("input[id= add to cart  ]")).click();
        Thread.sleep(5000);
        bag.findElement(By.cssSelector("input[id= click on cart container ]")).click();
        Thread.sleep(5000);
        bag.findElement(By.cssSelector("input[id= check out ]")).click();

    }
}

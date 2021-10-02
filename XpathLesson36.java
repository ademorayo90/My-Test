package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLesson36 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        WebDriver bag = new ChromeDriver();
        bag.get("https://www.saucedemo.com/");
        bag.findElement(By.xpath("/html//input[@id='user-name' ]")).sendKeys("standard_user");
        Thread.sleep(5000);
        bag.findElement(By.xpath("/html//input[@id=' password' ]")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        bag.findElement(By. xpath("/html//input[@id= 'login-button' ]")).click();
        Thread.sleep(5000);
        bag.findElement(By. xpath("/html//input[@id= 'add to cart bags' ]")).click();
        Thread.sleep(5000);






    }
}

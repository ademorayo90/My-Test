package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchoronizationLesson45 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://mail.google.com/");
        //click on email id
        driver.findElement(By.xpath("//input[@id='identifierId']")).click() ;
        Thread.sleep(5000);
        //input the adeniyi.ademorayo90@gmail.com
        driver.findElement(By .id("email address")).sendKeys("adeniyi.ademorayo@gmail.com");
        //click on signup button
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]")).click() ;
    }

}

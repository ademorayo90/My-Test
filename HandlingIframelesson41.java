package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframelesson41
{
    public static void main(String[] args) {

    System.setProperty("webdriver.gecko.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
    //launch browser
    WebDriver driver = new ChromeDriver();
    // navigates to url[1]
    driver.navigate().to("https://jqueryui.com/dialog/");
    String text = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")).getText();
        System.out.println(text);
}



}
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//public class GoogleNavigateA {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        WebDriver school = new ChromeDriver();
        school.get("https:www.amazon.com/");
        school.findElement(By.id(twotabsearchtextbox)).sendKeys("school shoes");
    }

}

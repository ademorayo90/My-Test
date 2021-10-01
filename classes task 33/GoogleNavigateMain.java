package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigateMain {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        // navigates to the Url
        driver.get("https://www.goggle.com/");

    }

}
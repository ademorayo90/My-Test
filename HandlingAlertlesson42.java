package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingAlertlesson42   {
        public static void main(String[] args) throws InterruptedException {
        {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        //launch browser
        ChromeDriver driver = new ChromeDriver();
        // navigates to url[1]
        driver.navigate().to("https://testifyltd.com/");
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        String LinkedIn = "";
        for (String window:windows)  {
            driver.switchTo().window(window);
            Thread.sleep(3000);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/"))  {
                LinkedIn = driver.getCurrentUrl();



                String text = driver.findElement(By.xpath("//p[contains(text(),'As a software testing based company involved in Tr')]")).getText();
        System.out.println(text);
    }



        }


        }

        }

}
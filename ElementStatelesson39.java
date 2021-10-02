package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementStatelesson39 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        // navigates to url[1]
        driver.navigate().to("https://demoga.com/");
        driver.findElement(By.id("email")).sendKeys("jason@gmail.com");
        driver.findElement(By.id("password")).sendKeys("kjuyojk");
        Thread.sleep(5000);
        boolean state =driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"
        + "/div[2]/div[2]/div[4]/button[1] ")).isEnabled();
        Thread.sleep(5000);
        System.out.println(state);
    }


}

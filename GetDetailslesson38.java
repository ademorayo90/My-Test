package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class GetDetails {

    //public class GoogleNavigateA {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        WebDriver school = new ChromeDriver();
        school.get("https://worldweather.wmo.int/en/city.html?cityId=258");
        //String autocom =
        school.findElement(By.cssSelector("input#col-10 m_city_name fs0")).sendKeys("Lagos");
        Thread.sleep(5000);
        school.findElement(By.cssSelector(".top_city_submit")).click();
        String city = school.findElement(By.xpath("//div[@class =col-10 m_city_name fs0] ")).getText();
        System.out.println(city);
    }
    {

    }
}

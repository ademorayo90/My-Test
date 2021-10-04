package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.Driver;

public class Assertlesson47 {

    @Test
    public void hardOne() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");

        String Email ="testifyltd.uk";
        Assert.assertEquals(Email,"testi");
        System.out.println("code reached here");
    }
    @Test
    public void softone() {
        String Location = "lagos";
        SoftAssert job = new SoftAssert();
        job.assertEquals(Location,"ABUJA");
        System.out.println("code reached here");
    }
}






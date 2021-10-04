4import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lesson43Resize {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TMD\\IdeaProjects\\Seleniumtwo\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        WebElement resizeBox = driver.findElement(By.xpath("//div[@id='resizable']"));
        Actions resize = new Actions(driver);
        resize.clickAndHold(resizeBox).moveToElement(resizeBox).build().perform();
    }
}

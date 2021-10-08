package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KongaLoginPage {
    WebDriver edriver = null;
    public KongaLoginPage (WebDriver driver) {
        edriver = driver;
        PageFactory.initElements(edriver,this);


}

@FindBy (xpath = "//input[@id='username']")
private WebElement username;
    public WebElement getUsername() {
        return username;
    }
    @FindBy (xpath = "//input[@id='password']")
    private WebElement Password;
        public WebElement getPassword () {
                return Password;
}
    @FindBy (xpath = "//button[contains(text(),'Login')]")
    private WebElement login;
        public WebElement getLogin() {
            return login;

}
}


















//input[@id='username']
//input[@id='password']
// input[@id='password']


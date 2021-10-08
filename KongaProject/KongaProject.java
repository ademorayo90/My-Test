package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KongaCartPage {
    WebDriver sdriver = null;
    public KongaCartPage (WebDriver driver) {
        sdriver = driver;
        PageFactory.initElements(sdriver,this);


    }

    @FindBy(xpath = "//div[@id='__next']")
    private WebElement addTocart;
    public WebElement getaddTocart() {
        return addTocart;
    }
    @FindBy (xpath = "//span[contains(text(),'Subtotal')]")
    private WebElement Subtotal;
    public WebElement getSubtotal () {
        return Subtotal;
    }
    @FindBy (xpath = "//h1[contains(text(),'Checkout')]")
    private WebElement Checkout;
    public WebElement getCheckout () {
        return Checkout;

    }
    @FindBy (xpath = "//a[contains(text(),'Select Delivery Address')]")
    private WebElement SelectAddress;
    public WebElement getSelectAddress () {
        return SelectAddress;


}
@FindBy (xpath = "//a[contains(text(),'Select Pickup Location')]")
    private WebElement SelectLocation;
    public WebElement getSelectLocation () {
        return SelectLocation;


}
}








//a[contains(text(),'Select Pickup Location')]
//a[contains(text(),'Select Delivery Address')]



















//div[@id='__next']
//span[contains(text(),'Subtotal')]
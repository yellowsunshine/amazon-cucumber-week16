package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddToCartPage.class.getName());

    public AddToCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
    WebElement addToCartConfirmationMessage;

    public void verifyTheAddToCartMessage(String message) throws InterruptedException {
        //pmWaitUntilVisibilityOfElementLocated(By.linkText("Added to Cart"), 30);
        String actualMessage = pmGetTextFromElement(addToCartConfirmationMessage);
        Thread.sleep(5000);
        doVerifyElementsJU("Incorrect Message",message ,actualMessage );
        log.info("Verifying the Added To Cart Message :" + message);


    }
}

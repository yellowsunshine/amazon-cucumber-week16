package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (id = "twotabsearchtextbox")
    WebElement searchBox;

    @CacheLookup
    @FindBy (id = "nav-search-submit-button")
    WebElement searchButton;

    public void enterDataInTheSearchBox(String searchData){
        pmSendTextToElement(searchBox, searchData);
        log.info("Entering data in the search box :" + searchData + "<br>");

    }

    public void clickOnTheSearchButton(){
        pmClickOnElement(searchButton);
        log.info("Clicking on the search button :" + searchButton.toString() + "<br>");

    }




}

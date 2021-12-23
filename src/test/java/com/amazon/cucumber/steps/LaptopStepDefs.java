package com.amazon.cucumber.steps;

import com.amazon.pages.AddToCartPage;
import com.amazon.pages.FindYourProductPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SelectedProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopStepDefs {
    @Given("^User is on the amazon homepage$")
    public void userIsOnTheAmazonHomepage() {
    }

    @When("^User search for \"([^\"]*)\" laptop in the search bar$")
    public void userSearchForLaptopInTheSearchBar(String item)  {
        new HomePage().enterDataInTheSearchBox(item);

    }

    @And("^clicks on the search button$")
    public void clicksOnTheSearchButton() {
        new HomePage().clickOnTheSearchButton();
    }

    @And("^finds the selection from the pages \"([^\"]*)\"$")
    public void findsTheSelectionFromThePages(String laptopDescription) throws InterruptedException {
        new FindYourProductPage().findSelection(laptopDescription);


    }

    @And("^selects the quantity \"([^\"]*)\"$")
    public void selectsTheQuantity(String laptopQty)  {
        new SelectedProductPage().selectQuantity(laptopQty);
    }

    @And("^clicks on add to cart button$")
    public void clicksOnAddToCartButton() {
        new SelectedProductPage().addItemToCart();
    }

    @Then("^Verifies the add to cart message \"([^\"]*)\"$")
    public void verifiesTheAddToCartMessage(String message) throws InterruptedException {
        new AddToCartPage().verifyTheAddToCartMessage(message);

    }
}

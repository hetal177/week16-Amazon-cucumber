package com.amazon.cucumber.steps;

import com.amazon.pages.AddToCartPAge;
import com.amazon.pages.FindYourProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LAptopstepDef {
    @Given("^User is on the amazon homepage$")
    public void userIsOnTheAmazonHomepage() {

    }

    @When("^User search for \"([^\"]*)\" laptop in the search bar and click on search button and finds the selection from the pages \"([^\"]*)\"$")
    public void userSearchForLaptopInTheSearchBarAndClickOnSearchButtonAndFindsTheSelectionFromThePages(String productName, String targetLaptop) throws Throwable {
        new FindYourProductPage().SearchProduct("Laptop");
    }

    @And("^selects the quantity \"([^\"]*)\"$")
    public void selectsTheQuantity(String arg0) throws Throwable {
        new AddToCartPAge().clickOnProductMoreDeatailsLInk();
        new AddToCartPAge().clickOnQtyBtn();
        new AddToCartPAge().changeQuentityto3();


    }

    @And("^clicks on add to cart button$")
    public void clicksOnAddToCartButton() {
        new AddToCartPAge().setAddToCartBTN();
    }

    @Then("^Verifies the add to cart message \"([^\"]*)\"$")
    public void verifiesTheAddToCartMessage(String message) throws Throwable {
        new AddToCartPAge().verifyTheAddToCartMessage("Added to Cart");
    }
}

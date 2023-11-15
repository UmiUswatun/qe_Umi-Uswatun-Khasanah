package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.AddNewCart;

public class AddNewCartSteps {

    @Steps
    AddNewCart addCart;

    @Given("I set valid API endpoint for add new cart")
    public void setValidAPIEndpointForAddNewCart() {
        addCart.setValidAPIEndpointForAddNewCart();
    }

    @When("I send request for add new cart with valid input")
    public void sendValidRequestForAddNewCart() {
        addCart.sendValidRequestForAddNewCart();
    }



    @And("I can add new cart")
    public void addNewCart() {
        addCart.addNewCart();
    }

    @When("I send request for add new cart with invalid input")
    public void sendInvalidRequestForAddNewCart() {
        addCart.sendInvalidRequestForAddNewCart();
    }

    @Given("I set invalid API endpoint for add new cart")
    public void setInvalidAPIEndpointForAddNewCart() {
        addCart.setInvalidAPIEndpointForAddNewCart();
    }

}

package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.UpdateCart;
import starter.user.user.UpdateUser;

public class UpdateCartSteps {

    @Steps
    UpdateCart updateCart;

    @Given("I set valid API endpoint for update cart data")
    public void setValidAPIEndpointForUpdateCart() {
        updateCart.setValidAPIEndpointForUpdateCart();
    }

    @When("I send request for update cart data with valid input")
    public void sendValidRequestForUpdateCart() {
        updateCart.sendValidRequestForUpdateCart();
    }

    @And("I can update cart data")
    public void canUpdateCart() {
        updateCart.canUpdateCart();
    }

    @When("I send request for update cart data with invalid input")
    public void sendInvalidRequestForUpdateCart() {
        updateCart.sendInvalidRequestForUpdateCart();
    }

    @Given("I set invalid API endpoint for update cart data")
    public void setInvalidAPIEndpointForUpdateCart() {
        updateCart.setInvalidAPIEndpointForUpdateCart();
    }
}

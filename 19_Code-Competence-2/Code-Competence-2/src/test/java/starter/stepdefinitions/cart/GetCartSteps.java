package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.GetCart;
import starter.user.user.GetUser;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCartSteps {

    @Steps
    GetCart getCart;

    @Given("I set valid API endpoint for get cart data")
    public void setValidAPIEndpointForGetCartData() {
        getCart.setValidAPIEndpointForGetCartData();
    }

    @When("I send valid request for get new cart")
    public void sendValidRequest() {
        getCart.sendValidRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {getCart.receiveStatusCode200();

    }

    @And("I get valid cart data")
    public void getValidUserCart() {
        getCart.getValidUserCart();
    }

    @Given("I set invalid API endpoint for get cart data")
    public void setInvalidAPIEndpointForGetCartData(){
        getCart.setInvalidAPIEndpointForGetCartData();
    }

    @When("I send invalid request for get new cart")
    public void sendInvalidRequest() {
        getCart.sendInvalidRequest();
    }

}

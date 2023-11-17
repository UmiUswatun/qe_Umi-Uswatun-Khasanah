package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.orders.CreateNewOrder;


public class CreateNewOrderSteps {
    @Steps
    CreateNewOrder createNewOrder;

    @Given("I set valid API endpoint for create a new order")
    public void setValidAPIEndpoint() {
        createNewOrder.setValidAPIEndpoint();
    }

    @When("I send request to create a new order with valid inputs")
    public void sendValidRequest() {
        createNewOrder.sendValidRequest();
    }

    @Then("I receive status code 401")
    public void receiveStatusCode401() {
        createNewOrder.receiveStatusCode401();
    }

    @And("I receive valid data for create a new order")
    public void receiveValidProductData() {
        createNewOrder.receiveValidData();
    }

    @When("I send request to create a new order with invalid inputs")
    public void sendInvalidRequest() {
        createNewOrder.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for create a new order")
    public void setInvalidAPIEndpoint() {
        createNewOrder.setInvalidAPIEndpoint();
    }

    @When("I send request to create a new order with valid inputs 1")
    public void sendValidRequest1() {
        createNewOrder.sendValidRequest1();
    }

}

package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.orders.GetOrderById;

public class GetOrderByIdSteps {
    @Steps
    GetOrderById getOrderById;

    @Given("I set valid API endpoint for get order by id")
    public void setValidAPIEndpoint() {
        getOrderById.setValidAPIEndpoint();
    }

    @When("I send valid request to get order by id")
    public void sendValidRequest() {
        getOrderById.sendValidRequest();
    }

    @And("I receive valid data for order by id")
    public void receiveValidProductData() {
        getOrderById.receiveValidProductData();
    }

    @When("I send invalid request to get order by id")
    public void sendInvalidRequest() {
        getOrderById.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get order by id")
    public void setInvalidAPIEndpoint() {
        getOrderById.setInvalidAPIEndpoint();
    }

    @When("I send valid request to get order by id 1")
    public void sendValidRequest1() {
        getOrderById.sendValidRequest1();
    }
}


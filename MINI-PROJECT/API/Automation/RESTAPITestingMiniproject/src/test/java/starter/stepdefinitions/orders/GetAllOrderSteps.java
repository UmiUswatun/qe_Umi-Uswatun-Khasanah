package starter.stepdefinitions.orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.orders.GetAllOrder;

public class GetAllOrderSteps {

    @Steps
    GetAllOrder getAllOrder;

    @Given("I set valid API endpoint for get all order")
    public void setValidAPIEndpoint() {
        getAllOrder.setValidAPIEndpoint();
    }

    @When("I send valid request to get all order")
    public void sendValidRequest() {
        getAllOrder.sendValidRequest();
    }

    @And("I receive valid data for all order")
    public void receiveValidProductData() {
        getAllOrder.receiveValidProductData();
    }

    @When("I send invalid request to get all order")
    public void sendInvalidRequest() {
        getAllOrder.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get all order")
    public void setInvalidAPIEndpoint() {
        getAllOrder.setInvalidAPIEndpoint();
    }

    @When("I send valid request to get all order 1")
    public void sendValidRequest1() {
        getAllOrder.sendValidRequest1();
    }
}
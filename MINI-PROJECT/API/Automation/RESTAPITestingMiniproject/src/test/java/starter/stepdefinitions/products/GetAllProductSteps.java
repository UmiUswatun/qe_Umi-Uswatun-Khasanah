package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetAllProduct;

public class GetAllProductSteps {

    @Steps
    GetAllProduct getAllProduct;

    @Given("I set valid API endpoint for get all product")
    public void setValidAPIEndpoint() {
        getAllProduct.setValidAPIEndpoint();
    }

    @When("I send valid request to get all product")
    public void sendValidRequest() {
        getAllProduct.sendValidRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getAllProduct.receiveStatusCode200();
    }

    @And("I receive valid data for all product")
    public void receiveValidProductData() {
        getAllProduct.receiveValidProductData();
    }

    @When("I send invalid request to get all product")
    public void sendInvalidRequest() {
        getAllProduct.sendInvalidRequest();
    }

    @Then("I receive status code 405")
    public void receiveStatusCode405() {
        getAllProduct.receiveStatusCode405();
    }

    @Given("I set invalid API endpoint for get all product")
    public void setInvalidAPIEndpoint() {
        getAllProduct.setInvalidAPIEndpoint();
    }

    @Then("I receive status code 404")
    public void receiveStatusCode404() {
        getAllProduct.receiveStatusCode404();
    }

    @When("I send valid request to get all product 1")
    public void sendValidRequest1() {
        getAllProduct.sendValidRequest1();
    }

}

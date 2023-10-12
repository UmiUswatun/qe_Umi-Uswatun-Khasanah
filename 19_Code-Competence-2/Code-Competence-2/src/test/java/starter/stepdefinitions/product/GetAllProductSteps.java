package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetAllProduct;

public class GetAllProductSteps {

    @Steps
    GetAllProduct getAllProduct;

    @Given("I set valid API endpoint for data product")
    public void setValidAPIEndpointForDataProduct() {
        getAllProduct.setValidAPIEndpointForDataProduct();
    }

    @When("I send valid request")
    public void sendValidRequest() {
        getAllProduct.sendValidRequest();
    }

    @And("I get valid data for all product")
    public void getValidData() {
        getAllProduct.getValidData();
    }

    @Given("I set invalid API endpoint for data product")
    public void setInvalidAPIEndpointForDataProduct(){
        getAllProduct.setInvalidAPIEndpointForDataProduct();
    }

    @When("I send invalid request")
    public void sendInvalidRequest() {
        getAllProduct.sendInvalidRequest();
    }

    @Then("I receive status code 404")
    public void receiveStatusCode404() {
        getAllProduct.receiveStatusCode404();
    }
}

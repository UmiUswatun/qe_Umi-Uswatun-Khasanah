package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductById;

public class GetProductByIdSteps {
    @Steps
    GetProductById getProductById;

    @Given("I set valid API endpoint for get product by id")
    public void setValidAPIEndpoint() {
        getProductById.setValidAPIEndpoint();
    }

    @When("I send valid request to get product by id")
    public void sendValidRequest() {
        getProductById.sendValidRequest();
    }

    @And("I receive valid data for product id")
    public void receiveValidProductData() {
        getProductById.receiveValidProductData();
    }

    @When("I send invalid request to get product by id")
    public void sendInvalidRequest() {
        getProductById.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get product by id")
    public void setInvalidAPIEndpoint() {getProductById.setInvalidAPIEndpoint();}

    @When("I send valid request to get product by id 1")
    public void sendValidRequest1() {getProductById.sendValidRequest1();}

}

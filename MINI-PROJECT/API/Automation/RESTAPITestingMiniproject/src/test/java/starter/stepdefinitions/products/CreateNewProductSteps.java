package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.CreateNewProduct;

public class CreateNewProductSteps {
    @Steps
    CreateNewProduct createNewProduct;

    @Given("I set valid API endpoint for create a new product")
    public void setValidAPIEndpoint() {createNewProduct.setValidAPIEndpoint();}

    @When("I send request to create a new product with valid inputs")
    public void sendValidRequest() {createNewProduct.sendValidRequest();}

    @And("I receive valid data for create a new product")
    public void receiveValidData() {createNewProduct.receiveValidData();}

    @When("I send request to create a new product with invalid inputs")
    public void sendInvalidRequest() {createNewProduct.sendInvalidrequest();}

    @Given("I set invalid API endpoint for create a new product")
    public void setInvalidAPIEndpoint() {createNewProduct.setInvalidAPIEndpoint();}

    @When("I send request to create a new product with valid inputs 1")
    public void sendValidRequest1() {createNewProduct.sendValidRequest1();}

}

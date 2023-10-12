package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.UpdateAProduct;

public class UpdateAProductSteps {

    @Steps
    UpdateAProduct updateAProduct ;

    @Given("I set valid API endpoint for update a product")
    public void setValidAPIEndpointForUpdateProduct() {
        updateAProduct.setValidAPIEndpointForUpdateProduct();
    }

    @When("I send request for update a product with valid input")
    public void sendValidRequestForUpdateProduct() {
        updateAProduct.sendValidRequestForUpdateProduct();
    }

    @And("I can update a product")
    public void canUpdateAProduct() {
        updateAProduct.canUpdateAProduct();
    }

    @When("I send request for update a product with invalid input")
    public void sendInvalidRequestForUpdateProduct() {
        updateAProduct.sendInvalidRequestForUpdateProduct();
    }

    @Given("I set invalid API endpoint for update a product")
    public void setInvalidAPIEndpointForUpdateProduct() {
        updateAProduct.setInvalidAPIEndpointForUpdateProduct();
    }
}

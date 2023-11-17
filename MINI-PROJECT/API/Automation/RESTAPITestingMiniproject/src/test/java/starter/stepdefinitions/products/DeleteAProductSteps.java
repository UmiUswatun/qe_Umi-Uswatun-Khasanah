package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.DeleteAProduct;

public class DeleteAProductSteps {

    @Steps
    DeleteAProduct deleteAProduct;

    @Given("I set valid API endpoint for delete a product")
    public void setValidAPIEndpoint() {
        deleteAProduct.setValidAPIEndpoint();
    }

    @When("I send valid request to delete a product")
    public void sendValidRequest() {
        deleteAProduct.sendValidRequest();
    }

    @And("I receive valid data for delete a product")
    public void receiveValidProductData() {
        deleteAProduct.receiveValidProductData();
    }

    @When("I send invalid request to delete a product")
    public void sendInvalidRequest() {
        deleteAProduct.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for delete a product")
    public void setInvalidAPIEndpoint() {deleteAProduct.setInvalidAPIEndpoint();}

    @When("I send valid request to delete a product 1")
    public void sendValidRequest1() {deleteAProduct.sendValidRequest1();}

}

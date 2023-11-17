package starter.stepdefinitions.productcategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.productcategories.DeleteACategory;

public class DeleteACategorySteps {

    @Steps
    DeleteACategory deleteACategory;

    @Given("I set valid API endpoint for delete a category")
    public void setValidAPIEndpoint() {
        deleteACategory.setValidAPIEndpoint();
    }

    @When("I send valid request to delete a category")
    public void sendValidRequest() {
        deleteACategory.sendValidRequest();
    }

    @And("I receive valid data for delete a category")
    public void receiveValidProductData() {
        deleteACategory.receiveValidProductData();
    }

    @When("I send invalid request to delete a category")
    public void sendInvalidRequest() {
        deleteACategory.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for delete a category")
    public void setInvalidAPIEndpoint() {deleteACategory.setInvalidAPIEndpoint();}

    @When("I send valid request to delete a category 1")
    public void sendValidRequest1() {deleteACategory.sendValidRequest1();}

}

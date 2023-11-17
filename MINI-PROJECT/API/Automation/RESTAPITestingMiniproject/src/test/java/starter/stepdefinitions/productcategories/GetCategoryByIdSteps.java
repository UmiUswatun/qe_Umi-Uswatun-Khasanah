package starter.stepdefinitions.productcategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.productcategories.GetCategoryById;

public class GetCategoryByIdSteps {
    @Steps
    GetCategoryById getCategoryById;

    @Given("I set valid API endpoint for get category by Id")
    public void setValidAPIEndpoint() {
        getCategoryById.setValidAPIEndpoint();
    }

    @When("I send valid request to get category by Id")
    public void sendValidRequest() {
        getCategoryById.sendValidRequest();
    }

    @And("I receive valid data for category by Id")
    public void receiveValidProductData() {
        getCategoryById.receiveValidProductData();
    }

    @When("I send invalid request to get category by Id")
    public void sendInvalidRequest() {
        getCategoryById.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get category by Id")
    public void setInvalidAPIEndpoint() {getCategoryById.setInvalidAPIEndpoint();}

    @When("I send valid request to get category by Id 1")
    public void sendValidRequest1() {getCategoryById.sendValidRequest1();}

}

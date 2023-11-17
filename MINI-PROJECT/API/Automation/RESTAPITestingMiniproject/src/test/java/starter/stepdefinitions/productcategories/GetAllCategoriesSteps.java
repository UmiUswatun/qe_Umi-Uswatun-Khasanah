package starter.stepdefinitions.productcategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.productcategories.GetAllCategories;

public class GetAllCategoriesSteps {

    @Steps
    GetAllCategories getAllCategories;

    @Given("I set valid API endpoint for get all categories")
    public void setValidAPIEndpoint() {
        getAllCategories.setValidAPIEndpoint();
    }

    @When("I send valid request to get all categories")
    public void sendValidRequest() {
        getAllCategories.sendValidRequest();
    }

    @And("I receive valid data for all categories")
    public void receiveValidProductData() {
        getAllCategories.receiveValidProductData();
    }

    @When("I send invalid request to get all categories")
    public void sendInvalidRequest() {
        getAllCategories.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get all categories")
    public void setInvalidAPIEndpoint() {
        getAllCategories.setInvalidAPIEndpoint();
    }

    @When("I send valid request to get all categories 1")
    public void sendValidRequest1() {
        getAllCategories.sendValidRequest1();
    }

}

package starter.stepdefinitions.productcategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.productcategories.CreateACategory;

public class CreateACategorySteps {

    @Steps
    CreateACategory createACategory;

    @Given("I set valid API endpoint for create a new category")
    public void setValidAPIEndpoint() {createACategory.setValidAPIEndpoint();}

    @When("I send request to create a new category with valid inputs")
    public void sendValidRequest() {createACategory.sendValidRequest();}

    @And("I receive valid data for create a new category")
    public void receiveValidData() {createACategory.receiveValidData();}

    @When("I send request to create a new category with invalid inputs")
    public void sendInvalidRequest() {createACategory.sendInvalidrequest();}

    @Given("I set invalid API endpoint for create a new category")
    public void setInvalidAPIEndpoint() {createACategory.setInvalidAPIEndpoint();}

    @When("I send request to create a new category with valid inputs 1")
    public void sendValidRequest1() {createACategory.sendValidRequest1();}

}


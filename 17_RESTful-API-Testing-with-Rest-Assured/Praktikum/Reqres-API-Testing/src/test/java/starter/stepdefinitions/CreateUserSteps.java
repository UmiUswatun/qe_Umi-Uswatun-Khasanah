package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.CreateUser;

public class CreateUserSteps {

    @Steps
    CreateUser createUser;

    @Given("I set valid API endpoint for create user")
    public void setApiEndpoint() {
        createUser.setApiEndpoint();
    }

    @When("I send request to create user with valid inputs")
    public void sendCreateUserRequest() {
        createUser.sendCreateUserRequest();
    }

    @Then("I receive status code 201")
    public void receiveStatusCode201() {
        createUser.receiveStatusCode201();
    }

    @And("I receive valid data for created user")
    public void receiveValidCreatedUserData() {
        createUser.receiveValidCreatedUserData();
    }

    @Given("I set invalid API endpoint for create user")
    public void setInvalidApiEndpoint() {
        createUser.setInvalidApiEndpoint();
    }

    @When("I send request to create user with invalid inputs")
    public void sendInvalidCreateUserRequest() {
        createUser.sendInvalidCreateUserRequest();
    }

    @Then("I receive status code 500")
    public void receiveInvalidStatusCode500 () {
        createUser.receiveInvalidStatusCode500();
    }

    @And("I receive syntax error message")
    public void receiveSyntaxErrorMessage() {
        createUser.receiveSyntaxErrorMessage();
    }
}
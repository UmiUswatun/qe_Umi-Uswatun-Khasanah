package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.GetUser;

public class GetUserSteps {

    @Steps
    GetUser getUser;

    @Given("I set valid API endpoint for get user")
    public void setValidApiEndpoint() {
        getUser.setValidApiEndpoint();
    }

    @When("I send request to get user")
    public void sendGetUserRequest() {
        getUser.sendGetUserRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getUser.receiveStatusCode200();
    }

    @And("I receive valid data for user")
    public void receiveValidUserData() {
        getUser.receiveValidUserData();
    }

    @Given("I set invalid API endpoint for get user")
    public void setInvalidApiEndpoint() {
        getUser.setInvalidApiEndpoint();
    }

    @Then("I receive status code 404")
    public void receiveInvalidStatusCode404() {
        getUser.receiveInvalidStatusCode404();
    }

}
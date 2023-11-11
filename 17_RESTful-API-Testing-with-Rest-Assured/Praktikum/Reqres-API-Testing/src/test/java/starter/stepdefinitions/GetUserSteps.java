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

    @Given("I set valid API endpoint for get user data")
    public void setValidAPIEndpoint() {
        getUser.setValidAPIEndpoint();
    }

    @When("I send valid request to get user data")
    public void sendValidRequest() {
        getUser.sendValidRequest();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getUser.receiveStatusCode200();
    }

    @And("I receive valid data for user data")
    public void receiveValidProductData() {
        getUser.receiveValidUserData();
    }

    @When("I send invalid request to get user data")
    public void sendInvalidRequest() {
        getUser.sendInvalidRequest();
    }

    @Then("I receive status code 404")
    public void receiveStatusCode404() {
        getUser.receiveStatusCode404();
    }

    @Given("I set invalid API endpoint for get user data")
    public void setInvalidAPIEndpoint() {
        getUser.setInvalidAPIEndpoint();
    }

    @When("I send valid request to get user data 1")
    public void sendValidRequest1() {
        getUser.sendValidRequest1();
    }

}
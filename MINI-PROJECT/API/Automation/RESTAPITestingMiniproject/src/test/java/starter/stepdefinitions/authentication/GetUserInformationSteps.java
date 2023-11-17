package starter.stepdefinitions.authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.authentication.GetUserInformation;

public class GetUserInformationSteps {

    @Steps
    GetUserInformation getUserInformation;

    @Given("I set valid API endpoint for get user Information")
    public void setValidAPIEndpoint() {
        getUserInformation.setValidAPIEndpoint();
    }

    @When("I send valid request to get user Information")
    public void sendValidRequest() {
        getUserInformation.sendValidRequest();
    }

    @And("I receive valid data for user Information")
    public void receiveValidProductData() {
        getUserInformation.receiveValidProductData();
    }

    @When("I send invalid request to get user Information")
    public void sendInvalidRequest() {getUserInformation.sendInvalidRequest();}

    @Given("I set invalid API endpoint for get user Information")
    public void setInvalidAPIEndpoint() {getUserInformation.setInvalidAPIEndpoint();}

    @When("I send valid request to get user Information 1")
    public void sendValidRequest1() {getUserInformation.sendValidRequest1();}
}


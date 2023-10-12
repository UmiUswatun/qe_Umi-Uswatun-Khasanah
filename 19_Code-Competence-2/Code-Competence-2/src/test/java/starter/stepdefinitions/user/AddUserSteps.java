package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.user.AddUser;

public class AddUserSteps {

    @Steps
    AddUser addUser;

    @Given("I set valid API endpoint for add new user")
    public void setValidAPIEndpointForAddUser() {
        addUser.setValidAPIEndpointForAddUser();
    }

    @When("I send request for add new user with valid input")
    public void sendValidRequestForAddNewUser() {
        addUser.sendValidRequestForAddNewUser();
    }

    @And("I can add new user")
    public void addNewUser() {
        addUser.addNewUser();
    }

    @When("I send request for add new user with invalid input")
    public void sendInvalidRequestForAddNewUser() {
        addUser.sendInvalidRequestForAddNewUser();
    }

    @Then("I receive status code 404 for add user data")
    public void getStatusCode() {
        addUser.getStatusCode();
    }

    @Given("I set invalid API endpoint for add new user")
    public void setInvalidAPIEndpointForAddNewUser() {
        addUser.setInvalidAPIEndpointForAddNewUser();
    }


}

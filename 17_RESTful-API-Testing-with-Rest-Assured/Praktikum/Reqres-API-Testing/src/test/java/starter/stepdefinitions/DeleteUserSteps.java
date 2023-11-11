package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.DeleteUser;

public class DeleteUserSteps {

    @Steps
    DeleteUser deleteUser;

    @Given("I set valid API endpoint for delete user")
    public void setValidAPIEndpoint() {
        deleteUser.setValidAPIEndpoint();
    }

    @When("I send request to delete user")
    public void sendValidRequest() {
        deleteUser.sendValidRequest();
    }

    @When("I send request to delete user 1")
    public void sendValidRequest1() {
        deleteUser.sendValidRequest1();
    }

    @Given("I set invalid API endpoint for delete user")
    public void setInvalidApiEndpoint() {
        deleteUser.setInvalidApiEndpoint();
    }

}
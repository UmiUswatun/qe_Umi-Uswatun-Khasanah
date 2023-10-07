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
    public void setApiEndpoint() {
        deleteUser.setApiEndpoint();
    }

    @When("I send request to delete user")
    public void sendDeleteUserRequest() {
        deleteUser.sendDeleteUserRequest();
    }

    @Given("I set invalid API endpoint for delete user")
    public void setInvalidApiEndpoint() {
        deleteUser.setInvalidApiEndpoint();
    }

}
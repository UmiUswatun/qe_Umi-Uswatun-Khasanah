package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.UpdateUser;

public class UpdateUserSteps {

    @Steps
    UpdateUser updateUser;

    @Given("I set valid API endpoint for update user")
    public void setApiEndpoint() {
        updateUser.setApiEndpoint();
    }

    @When("I send request to update user with valid inputs")
    public void sendUpdateUserRequest() {
        updateUser.sendUpdateUserRequest();
    }

    @And("I receive valid data for updated user")
    public void receiveValidUpdatedUserData() {
        updateUser.receiveValidUpdatedUserData();
    }

    @Given("I set invalid API endpoint for update user")
    public void setInvalidApiEndpoint() {
        updateUser.setInvalidApiEndpoint();
    }

    @When("I send request to update user with invalid inputs")
    public void sendInvalidUpdateUserRequest() {
        updateUser.sendInvalidUpdateUserRequest();
    }

}

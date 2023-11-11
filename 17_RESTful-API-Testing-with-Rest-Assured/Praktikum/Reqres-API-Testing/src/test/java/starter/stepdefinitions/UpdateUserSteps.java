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

    @And("I receive valid data for update user")
    public void receiveValidUpdateUserData() {
        updateUser.receiveValidUpdateUserData();
    }

    @Given("I set invalid API endpoint for update user")
    public void setInvalidApiEndpoint() {
        updateUser.setInvalidAPIEndpoint();
    }

    @When("I send request to update user with invalid inputs")
    public void sendInvalidUpdateUserRequest() {
        updateUser.sendInvalidUpdateUserRequest();
    }

    @And("I receive id for update user")
    public void receiveValidId() {updateUser.receiveValidId();}

    @When("I send request to update user with valid inputs 1")
    public void sendInvalidUpdateUserRequest1() {
        updateUser.sendInvalidUpdateUserRequest1();
    }

    @When("I send request to update user with invalid inputs 2")
    public void sendInvalidUpdateUserRequest2() {
        updateUser.sendInvalidUpdateUserRequest2();
    }


}

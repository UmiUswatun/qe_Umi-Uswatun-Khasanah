package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.UpdateAProduct;
import starter.user.user.UpdateUser;

public class UpdateUserSteps {

    @Steps
    UpdateUser updateUser ;

    @Given("I set valid API endpoint for update user data")
    public void setValidAPIEndpointForUpdateUser() {
        updateUser.setValidAPIEndpointForUpdateUser();
    }

    @When("I send request for update user data with valid input")
    public void sendValidRequestForUpdateUser() {
        updateUser.sendValidRequestForUpdateUser();
    }

    @And("I can update user data")
    public void canUpdateUser() {
        updateUser.canUpdateUser();
    }

    @When("I send request for update user data with invalid input")
    public void sendInvalidRequestForUpdateUser() {
        updateUser.sendInvalidRequestForUpdateUser();
    }

    @Then("I receive status code 404 for update user data")
    public void getStatusCode404() {
        updateUser.getStatuscode404();
    }

    @Given("I set invalid API endpoint for update user data")
    public void setInvalidAPIEndpointForUpdateUser() {
        updateUser.setInvalidAPIEndpointForUpdateUser();
    }
}

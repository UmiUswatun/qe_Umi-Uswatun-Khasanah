package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.DeleteAProduct;
import starter.user.user.DeleteUser;

public class DeleteUserSteps {

    @Steps
    DeleteUser deleteUser;

    @Given("I set valid API endpoint for delete user data")
    public void setValidAPIEndpointForDeleteUser() {
        deleteUser.setValidAPIEndpointForDeleteUser();
    }
    @When("I send valid request for delete user")
    public void sendValidRequest() {deleteUser.sendValidRequest();}
    @And("I can delete user data")
    public void canDeleteUserData() {
        deleteUser.canDeleteUserData();
    }
    @When("I send invalid request for delete user")
    public void sendInvalidRequest() {deleteUser.sendInvalidRequest();}
    @Given("I set invalid API endpoint for delete user data")
    public void setInvalidAPIEndpointForDeleteUserData() {
        deleteUser.setInvalidAPIEndpointForDeleteUserData();
    }
}

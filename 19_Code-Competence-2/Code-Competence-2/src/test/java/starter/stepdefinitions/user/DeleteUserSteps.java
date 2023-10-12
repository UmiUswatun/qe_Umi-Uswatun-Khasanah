package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
    @And("I can delete user data")
    public void canDeleteUserData() {
        deleteUser.canDeleteUserData();
    }
    @Given("I set invalid API endpoint for delete user data")
    public void setInvalidAPIEndpointForDeleteUserData() {
        deleteUser.setInvalidAPIEndpointForDeleteUserData();
    }
}

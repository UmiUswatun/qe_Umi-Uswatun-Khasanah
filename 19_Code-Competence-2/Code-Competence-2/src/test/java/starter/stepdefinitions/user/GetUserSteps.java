package starter.stepdefinitions.user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.product.GetAllProduct;
import starter.user.user.GetUser;

public class GetUserSteps {

    @Steps
    GetUser getUser;

    @Given("I set valid API endpoint for get user data")
    public void setValidAPIEndpointForGetUserData() {
        getUser.setValidAPIEndpointForGetUserData();
    }

    @And("I get valid user data")
    public void getValidUserData() {
        getUser.getValidUserData();
    }

    @Given("I set invalid API endpoint for get user data")
    public void setInvalidAPIEndpointForGetUserData(){
        getUser.setInvalidAPIEndpointForGetUserData();
    }

}

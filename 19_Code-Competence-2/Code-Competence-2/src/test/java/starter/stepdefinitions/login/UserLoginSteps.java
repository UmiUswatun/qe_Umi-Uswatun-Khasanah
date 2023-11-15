package starter.stepdefinitions.login;

import net.thucydides.core.annotations.Steps;
import starter.user.login.UserLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class UserLoginSteps {

    @Steps
    UserLogin userlogin;

    @Given("I set valid API endpoint")
    public void setValidAPIEndpoint() {
        userlogin.setValidAPIEndpoint();
    }

    @When("I send request with valid input")
    public void sendValidRequest() {
        userlogin.sendValidRequest();
    }

    @And("I get the token for login")
    public void getTheToken() {
        userlogin.getTheToken();
    }

    @Given("I set invalid API endpoint")
    public void setInvalidAPIEndpoint(){
        userlogin.setInvalidAPIEndpoint();
    }

    @When("I send request with invalid input")
    public void sendInvalidRequest() {
        userlogin.sendInvalidRequest();
    }

    @And("I got an error message")
    public void getErrorMessage(){
        userlogin.getErrorMessage();
    }

}

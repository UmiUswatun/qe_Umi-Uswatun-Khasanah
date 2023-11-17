package starter.stepdefinitions.hello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.hello.GetIndex;

public class GetIndexSteps {
    @Steps
    GetIndex getIndex;

    @Given("I set valid API endpoint for get index")
    public void setValidAPIEndpoint() {
        getIndex.setValidAPIEndpoint();
    }

    @When("I send valid request to get index")
    public void sendValidRequest() {
        getIndex.sendValidRequest();
    }

    @And("I receive valid data for index")
    public void receiveValidProductData() {
        getIndex.receiveValidProductData();
    }

    @When("I send invalid request to get index")
    public void sendInvalidRequest() {
        getIndex.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get index")
    public void setInvalidAPIEndpoint() {getIndex.setInvalidAPIEndpoint();}

    @When("I send valid request to get index 1")
    public void sendValidRequest1() {getIndex.sendValidRequest1();}

}
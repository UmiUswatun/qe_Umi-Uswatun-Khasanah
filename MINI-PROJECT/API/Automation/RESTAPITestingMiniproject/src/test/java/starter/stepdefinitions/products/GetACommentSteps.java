package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetAComment;

public class GetACommentSteps {
    @Steps
    GetAComment getAComment;

    @Given("I set valid API endpoint for get comment")
    public void setValidAPIEndpoint() {
        getAComment.setValidAPIEndpoint();
    }

    @When("I send valid request to get comment")
    public void sendValidRequest() {
        getAComment.sendValidRequest();
    }

    @And("I receive valid data for comment")
    public void receiveValidProductData() {
        getAComment.receiveValidProductData();
    }

    @When("I send invalid request to get comment")
    public void sendInvalidRequest() {
        getAComment.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get comment")
    public void setInvalidAPIEndpoint() {getAComment.setInvalidAPIEndpoint();}

    @When("I send valid request to get comment 1")
    public void sendValidRequest1() {getAComment.sendValidRequest1();}

}


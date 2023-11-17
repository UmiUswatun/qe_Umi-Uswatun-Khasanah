package starter.stepdefinitions.products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.products.GetProductRating;

public class GetProductRatingSteps {

    @Steps
    GetProductRating getProductRating;

    @Given("I set valid API endpoint for get product rating")
    public void setValidAPIEndpoint() {
        getProductRating.setValidAPIEndpoint();
    }

    @When("I send valid request to get product rating")
    public void sendValidRequest() {
        getProductRating.sendValidRequest();
    }

    @And("I receive valid data for product rating")
    public void receiveValidProductData() {
        getProductRating.receiveValidProductData();
    }

    @When("I send invalid request to get product rating")
    public void sendInvalidRequest() {
        getProductRating.sendInvalidRequest();
    }

    @Given("I set invalid API endpoint for get product rating")
    public void setInvalidAPIEndpoint() {getProductRating.setInvalidAPIEndpoint();}

    @When("I send valid request to get product rating 1")
    public void sendValidRequest1() {getProductRating.sendValidRequest1();}

}

package starter.stepdefinitions.cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.DeleteCart;
import starter.user.user.DeleteUser;

public class DeleteCartSteps {

    @Steps
    DeleteCart deleteCart;

    @Given("I set valid API endpoint for delete cart")
    public void setValidAPIEndpointForDeleteCart() {
        deleteCart.setValidAPIEndpointForDeleteCart();
    }

    @When("I send valid request for delete cart")
    public void sendValidRequest() {
        deleteCart.sendValidRequest();
    }

    @And("I can delete cart")
    public void canDeleteCart() {
        deleteCart.canDeleteCart();
    }

    @Given("I set invalid API endpoint for delete cart")
    public void setInvalidAPIEndpointForDeleteCart() {
        deleteCart.setInvalidAPIEndpointForDeleteCart();
    }

    @When("I send invalid request for delete cart")
    public void sendInvalidRequest() {
        deleteCart.sendInvalidRequest();
    }
}

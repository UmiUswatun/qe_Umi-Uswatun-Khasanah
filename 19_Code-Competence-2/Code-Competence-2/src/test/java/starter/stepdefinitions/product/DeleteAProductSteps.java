package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.user.product.DeleteAProduct;

public class DeleteAProductSteps {

    @Steps
    DeleteAProduct deleteAProduct;

    @Given("I set valid API endpoint for delete a product")
    public void setValidAPIEndpointForDelete() {
        deleteAProduct.setValidAPIEndpointForDelete();
    }
    @And("I can delete a product")
    public void canDeleteAProduct() {
        deleteAProduct.canDeleteAProduct();
    }
    @Given("I set invalid API endpoint for delete a product")
    public void setInvalidAPIEndpointForDelete() {
        deleteAProduct.setInvalidAPIEndpointForDelete();
    }
}

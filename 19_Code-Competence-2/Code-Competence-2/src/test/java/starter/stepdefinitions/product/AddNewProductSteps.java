package starter.stepdefinitions.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import starter.user.product.AddNewProduct;
import starter.user.product.GetAllProduct;

public class AddNewProductSteps {

    @Steps
    AddNewProduct addNewProduct;

    @Given("I set valid API endpoint for add new product")
    public void setValidAPIEndpointForAddNewProduct() {
        addNewProduct.setValidAPIEndpointForAddNewProduct();
    }

    @When("I send request for add new product with valid input")
    public void sendValidRequestForAddNewProduct() {
        addNewProduct.sendValidRequestForAddNewProduct();
    }

    @And("I can add new product")
    public void addNewProduct() {
        addNewProduct.addNewProduct();
    }

    @When("I send request for add new product with invalid input")
    public void sendInvalidRequestForAddNewProduct() {
        addNewProduct.sendInvalidRequestForAddNewProduct();
    }

    @Given("I set invalid API endpoint for add new product")
    public void setInvalidAPIEndpointForAddNewProduct() {
        addNewProduct.setInvalidAPIEndpointForAddNewProduct();
    }


}

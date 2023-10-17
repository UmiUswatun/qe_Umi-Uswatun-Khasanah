package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import starter.pages.ProductsPage;

public class CartSteps {

    @Steps
    ProductsPage productPage;

    @When("I click add to cart button")
    public void clickAddToCartButton() {
        productPage.clickAddToCartButton();
    }

    @Then("Item is added to the cart")
    public void itemsAdded(){
        Assert.assertTrue(productPage.itemsAdded());
    }

    @When("I remove items from the cart by click remove button")
    public void removeItems() {
        productPage.removeItems();
    }

    @Then("my cart should be empty")
    public void itemsRemoved() {
        Assert.assertFalse(productPage.itemsRemoved());
    }


}

package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.ProductsPage;

public class SelectProductSteps {

    @Steps
    ProductsPage productsPage;

    @Given("I am on the product page")
    public void onTheProductsPage() {
        productsPage.openUrl("https://alta-shop.vercel.app/");
        Assertions.assertTrue(productsPage.validateOnProductsPage());
    }

    @When("I click buy icon of one items")
    public void clickBuyButton() {
        productsPage.clickBuyButton();
    }

    @Then("I succeeded add items into the cart")
    public void validateCartCounter() {
        productsPage.validateCartCounter();
    }
}

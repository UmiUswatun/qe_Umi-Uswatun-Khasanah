package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.CartPage;
import starter.pages.InformationPage;
import starter.pages.CompletePage;
import starter.pages.OverviewPage;

public class CheckoutSteps {

    @Steps
    CartPage cartPage;

    @Steps
    InformationPage informationPage;

    @Steps
    OverviewPage overviewPage;

    @Steps
    CompletePage completePage;

    @Given("I am on the cart page")
    public void onTheCartPage() {
        cartPage.openUrl("https://www.saucedemo.com/cart.html");
        Assert.assertTrue(cartPage.onTheCartPage());
    }

    @When("I click checkout")
    public void clickCheckout() {
        cartPage.clickCheckout();
    }

    @And("I redirected to your information page")
    public void redirectedToInformationPage() {
        informationPage.openUrl("https://www.saucedemo.com/checkout-step-one.html");
        Assert.assertTrue(informationPage.redirectedToInformationPage());
    }

    @And("I input valid credentials")
    public void InputValidCredentials(String firstName, String lastName, String postalCode) {
        informationPage.setFirstName(firstName);
        informationPage.setLastName(lastName);
        informationPage.setPostalCode(postalCode);
    }

    @And("I click continue button")
    public void clickContinueButton() {
        informationPage.clickContinueButton();
    }

    @And("I redirected to overview page")
    public void redirectedToOverviewPage() {
        overviewPage.openUrl("https://www.saucedemo.com/checkout-step-two.html");
        Assert.assertTrue(overviewPage.redirectedToOverviewPage());
    }

    @And("I click finish button")
    public void clickFinishButton() {
        overviewPage.clickFinishButton();
    }

    @Then("I redirected to compelete page")
    public void redirectedToCompletePage() {
        completePage.openUrl("https://www.saucedemo.com/checkout-complete.html");
        Assert.assertTrue(completePage.redirectedToCompletePage());
    }

    @And("I click back home button")
    public void clickBackHomeButton() {
        completePage.clickBackHomeButton();
    }

    @Then("I redirected to cart page")
    public void redirectedToCartPage() {
        cartPage.openUrl("https://www.saucedemo.com/cart.html");
        Assert.assertTrue(cartPage.onTheCartPage());
    }

    @And("I input invalid credentials")
    public void inputInvalidCredentials(String firstName, String lastName, String postalCode) {
        informationPage.setInvalidFirstName(firstName);
        informationPage.setInvalidLastName(lastName);
        informationPage.setInvalidPostalCode(postalCode);
    }

    @Then("I got an error message")
    public void gotAnErrorMessage() {
        Assert.assertFalse(informationPage.gotAnErrorMessage());
    }

    @When("I remove all the items")
    public void removeAllItems() {
        cartPage.removeAllItems();
    }

    @Then("I see that checkout button should not appear")
    public void checkoutButtonNotAppear() {
        Assert.assertFalse(cartPage.checkoutButtonNotAppear());
    }
}


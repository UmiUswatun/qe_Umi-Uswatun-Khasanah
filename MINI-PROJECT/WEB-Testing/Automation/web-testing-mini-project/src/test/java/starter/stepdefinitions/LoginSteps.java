package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductsPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    ProductsPage productsPage;

    @When("I click icon")
    public void clickButton() {
        productsPage.clickButton();
    }

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://alta-shop.vercel.app/auth/login");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    @When("I enter valid email")
    public void inputValidEmail() {
        loginPage.inputValidEmail();
    }

    @And("I enter valid password")
    public void inputValidPassword() {
        loginPage.inputValidPassword();
    }

    @And("I clicks the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I redirected to the product page")
    public void onTheProductsPage() {
        productsPage.openUrl("https://alta-shop.vercel.app/");
        Assertions.assertTrue(productsPage.validateOnProductsPage());
    }

    @When("I enter invalid email")
    public void inputInvalidEmail() {
        loginPage.inputInvalidEmail("ti.hdajjss@gmail.");
    }

    @And("I enter invalid password")
    public void inputInvalidPassword() {
        loginPage.inputInvalidPassword("22062003");
    }

    @Then("I see an error message {string}")
    public void validErrorMessageIsDisplayed(String message) {
        Assertions.assertTrue(loginPage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginPage.validateEqualErrorMessage(message));
    }

    @When("I leaving email fields blank")
    public void inputInvalidEmail1() {
        loginPage.inputInvalidEmail1("");
    }

    @And("I leaving password fields blank")
    public void inputInvalidPassword1() {
        loginPage.inputInvalidPassword1("");
    }

    @Then("I see an error message 1 {string}")
    public void validErrorMessageIsDisplayed1(String message) {
        Assertions.assertTrue(loginPage.validateErrorMessageIsDisplayed1());
    }
}

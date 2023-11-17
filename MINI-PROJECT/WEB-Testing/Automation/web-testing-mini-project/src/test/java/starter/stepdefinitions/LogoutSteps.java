package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductsPage;

public class LogoutSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    ProductsPage productPage;

    @Given("I Click side navbar icon")
    public void clickNavbarIcon() {productPage.clickNavbarIcon();}

    @And("I click Logout")
    public void clickLogoutButton() {productPage.clickLogoutButton();}

    @Then("I Should be on Login Page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://alta-shop.vercel.app/auth/login");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }



}

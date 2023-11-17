package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    RegisterPage registerPage;

    @When("I click register icon")
    public void clickRegisterIcon() {loginPage.clickRegisterIcon();}

    @Given("I am on the registration page")
    public void onTheRegistrationPage() {
        registerPage.openUrl("https://alta-shop.vercel.app/auth/register");
        Assertions.assertTrue(registerPage.onTheRegistrationPage());
    }

    @When("I enters valid credentials")
    public void inputValidCredentials() {
        registerPage.setEmail("atuy22062003@gmail.com");
        registerPage.setUserName("userName");
        registerPage.setPassword("123abc");
    }

    @And("I clicks the register button")
    public void clickButton() {registerPage.clickButton();}

    @Then("I redirected to the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://alta-shop.vercel.app/auth/login");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    @When("I enter registered email")
    public void inputInvalidCredentials() {
        registerPage.setInvalidEmail("tik.9d.umi.33@gmail.com");
        registerPage.setUserName("userName");
        registerPage.setPassword("password");
    }

    @Then("I see an error message")
    public void  validateErrorMessage() {
        Assertions.assertTrue(registerPage.validateErrorMessage());
    }

    @When("I leaving fields blank")
    public void inputInvalidCredentials1() {
        registerPage.setInvalidEmail1("");
        registerPage.setInvalidUserName("");
        registerPage.setInvalidPassword("");
    }

    @Then("I see an error message 1")
    public void validateErrorMessage1() {
        Assertions.assertTrue(registerPage.validateErrorMessage1());
    }
}

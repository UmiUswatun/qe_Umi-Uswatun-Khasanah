package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductsPage;
import starter.pages.TransactionPage;

public class TransactionSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    ProductsPage productPage;

    @Steps
    TransactionPage transactionPage;

    @And("I click Transaction button")
    public void clickTransactionButton() {productPage.clickTransactionButton();}

    @Then("I Should be on transaction Page")
    public void onTheLoginPage() {
        transactionPage.openUrl("https://alta-shop.vercel.app/transaction");
        Assertions.assertTrue(transactionPage.validateOnTransactionPage());
    }
}

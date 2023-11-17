package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {

    private By transactionPage() {return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/h1");}

    @Step
    public boolean validateOnTransactionPage() {return $(transactionPage()).isDisplayed();}
}

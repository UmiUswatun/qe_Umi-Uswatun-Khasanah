package starter.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InformationPage extends PageObject {


    private By firstNameField() {
        return By.id("first-name");
    }

    private By lastNameField() {
        return By.id("last-name");
    }

    private By postalCodeField() {
        return By.id("postal-code");
    }

    private By continueButton() {
        return By.id("continue");
    }

    private By errorMessage() {
        return By.xpath("h3[data-test='error']");
    }

    @Step
    public boolean redirectedToInformationPage() {return $(continueButton()).isDisplayed();}

    @Step
    public void setFirstName(String firstName) {
        $(firstNameField()).type(firstName);
    }

    @Step
    public void setLastName(String lastName) {
        $(lastNameField()).type(lastName);
    }

    @Step
    public void setPostalCode(String postalCode) {
        $(postalCodeField()).type(postalCode);
    }

    @Step
    public void clickContinueButton() {
        $(continueButton()).click();
    }

    @Step
    public void setInvalidFirstName(String firstName) {
        $(firstNameField()).type(null);
    }

    @Step
    public void setInvalidLastName(String lastName) {
        $(lastNameField()).type(null);
    }

    @Step
    public void setInvalidPostalCode(String postalcode) {
        $(postalCodeField()).type(null);
    }

    @Step
    public boolean gotAnErrorMessage() {
        return $(errorMessage()).isDisplayed();
    }
}

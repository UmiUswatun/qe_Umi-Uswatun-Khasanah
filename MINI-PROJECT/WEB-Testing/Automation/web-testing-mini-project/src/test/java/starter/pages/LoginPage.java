package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {
    private By emailField() {
        return By.xpath("//*[@id='input-18']");
    }

    private By passwordField() {
        return By.xpath("//*[@id='input-21']");
    }

    private By loginButton() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }

    private By errorMessage() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    private By errorMessage1() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");
    }

    private  By registerIcon() {return By.linkText("Register");}

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputValidEmail() {
        $(emailField()).type("tik.9d.umi.33@gmail.com");
    }

    @Step
    public void inputValidPassword() {
        $(passwordField()).type("Umi22062003");
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void inputInvalidEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputInvalidPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public boolean validateErrorMessageIsDisplayed() {
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

    @Step
    public void inputInvalidEmail1(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputInvalidPassword1(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public boolean validateErrorMessageIsDisplayed1() {
        return $(errorMessage1()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage1(String message) {
        return $(errorMessage1()).getText().equalsIgnoreCase(message);
    }

    @Step
    public void clickRegisterIcon()  {
        $(registerIcon()).click();
    }

}


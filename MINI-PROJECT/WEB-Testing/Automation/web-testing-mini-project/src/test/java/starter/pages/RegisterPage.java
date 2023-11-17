package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By emailField() {return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");}

    private By userNameField() {return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");}

    private By passwordField() {return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");}

    private By registerButton() {return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button/span");}

    private By errorMessage() {return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");}

    private By errorMessage1() {return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]/div/div[1]");}

    @Step
    public boolean onTheRegistrationPage() {return $(registerButton()).isDisplayed();}

    @Step
    public void setEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void setUserName(String userName) {
        $(userNameField()).type(userName);
    }

    @Step
    public void setPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickButton() {$(registerButton()).click();}

    @Step
    public void setInvalidEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public boolean validateErrorMessage() {
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public void setInvalidEmail1(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void setInvalidUserName(String userName) {
        $(userNameField()).type(userName);
    }

    @Step
    public void setInvalidPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public boolean validateErrorMessage1() {
        return $(errorMessage1()).isDisplayed();
    }

}

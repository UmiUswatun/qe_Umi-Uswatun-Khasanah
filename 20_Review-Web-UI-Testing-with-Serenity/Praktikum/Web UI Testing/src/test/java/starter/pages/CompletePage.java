package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
public class CompletePage extends PageObject {

    private By backHomeButton() {
        return By.id("back-to-products");
    }

    @Step
    public boolean redirectedToCompletePage() {return $(backHomeButton()).isDisplayed();}

    @Step
    public void clickBackHomeButton() {
        $(backHomeButton()).click();
    }

}

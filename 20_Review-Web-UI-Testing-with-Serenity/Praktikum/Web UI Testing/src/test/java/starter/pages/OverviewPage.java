package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends PageObject {


    private By finishButton() {
        return By.id("finish");
    }

    @Step
    public boolean redirectedToOverviewPage() {return $(finishButton()).isDisplayed();}

    @Step
    public void clickFinishButton() {
        $(finishButton()).click();
    }
}

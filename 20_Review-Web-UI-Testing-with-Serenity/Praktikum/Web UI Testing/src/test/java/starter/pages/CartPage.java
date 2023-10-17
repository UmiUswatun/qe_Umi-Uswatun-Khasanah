package starter.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.ensure.web.AnElementThat;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends PageObject {
    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    private By checkoutButton() {
        return By.id("checkout");
    }

    private By removeButton() {
        return By.className("btn btn_secondary btn_small cart_button");
    }
    @Step
    public boolean onTheCartPage() {
        return $(checkoutButton()).isDisplayed();
    }

    @Step
    public void clickCheckout() {
        $(checkoutButton()).click();
    }

    @Step
    public void removeAllItems() {
        $(removeButton()).click();
    }

    @Step
    public boolean checkoutButtonNotAppear() {
        return $(checkoutButton()).isDisabled();
    }
}

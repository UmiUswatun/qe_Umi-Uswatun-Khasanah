package starter.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;


public class CartPage extends PageObject {


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

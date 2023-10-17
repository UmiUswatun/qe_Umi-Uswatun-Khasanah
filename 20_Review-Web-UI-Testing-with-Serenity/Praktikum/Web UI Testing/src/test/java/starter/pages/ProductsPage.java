package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;


public class ProductsPage extends PageObject {

    private By title() {
        return By.className("title");
    }

    private By addToCartButton() {
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    private By cartCounter() {
        return By.className("shopping_cart_badge");
    }

    private By removeButton() {
        return By.className("btn btn_secondary btn_small btn_inventory");
    }

    @Step
    public boolean validateOnProductsPage() {
        return $(title()).isDisplayed();
    }

    @Step
    public boolean addToCartButtonIsDisplayed() {
        return $(addToCartButton()).isDisplayed();
    }

    @Step
    public void clickAddToCartButton() {
        $(addToCartButton()).click();
    }

    @Step
    public boolean validateCartCounterIsDisplayed() {
        return $(cartCounter()).isDisplayed();
    }

    @Step
    public boolean validateCartCounter() {
        return $(cartCounter()).getText().equals("1");
    }

    @Step
    public boolean itemsAdded() {
        return $(cartCounter()).getText().equals("1");
    }

    @Step
    public void removeItems() {
        $(removeButton()).click();
    }

    @Step
    public boolean itemsRemoved() {
        return false;
    }
}

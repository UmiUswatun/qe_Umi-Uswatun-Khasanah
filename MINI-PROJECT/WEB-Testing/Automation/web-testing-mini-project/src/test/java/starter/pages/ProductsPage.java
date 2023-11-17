package starter.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;

public class ProductsPage extends PageObject {
    private By transactionButton() {return By.xpath("/html/body/div/div[2]/div/div[1]");}

    private By button() {return By.className("v-icon notranslate fas fa-sign-in theme--dark"); }

    private By navbarIcon() {return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span/i"); }

    private By logoutButton() {return By.xpath("/html/body/div/div[2]/div/div[2]/div[2]");}

    private By buyButton() {return By.xpath("//*[@id=\"85531\"]/div/div[3]/div[2]/button[2]");}

    private By cartCounter() {return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[1]/span/span/i");}

    private By cartButton() {return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span/span/i");}

    @Step
    public boolean validateOnProductsPage() {
        return $(navbarIcon()).isDisplayed();
    }

    @Step
    public void clickButton() {
        $(button()).click();
    }

    @Step
    public void clickNavbarIcon() {$(navbarIcon()).click();}

    @Step
    public void clickLogoutButton() {$(logoutButton()).click();}

    @Step
    public void clickBuyButton() {$(buyButton()).click();}

    @Step
    public boolean validateCartCounter() {
        return $(cartCounter()).getText().equals("1");
    }

    @Step
    public void clickTransactionButton() {$(transactionButton()).click();}


}

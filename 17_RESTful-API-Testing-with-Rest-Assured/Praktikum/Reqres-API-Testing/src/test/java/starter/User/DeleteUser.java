package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    private static String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set valid API endpoint for delete user")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send request to delete user")
    public void sendValidRequest() {
        SerenityRest.given().delete(setValidAPIEndpoint());
    }

    private static String url1 = "https://jsonplaceholder.typicode.com/invalid";
    @Step("I set invalid API endpoint for delete user")
    public String setInvalidApiEndpoint() {
        return url1;
    }

    @Step("I send request to delete user 1")
    public void sendValidRequest1() {
        SerenityRest.given().delete(setInvalidApiEndpoint());
    }
}

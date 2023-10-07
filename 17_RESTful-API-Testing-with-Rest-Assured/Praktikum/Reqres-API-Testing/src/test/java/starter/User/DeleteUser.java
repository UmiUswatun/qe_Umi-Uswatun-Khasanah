package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set valid API endpoint for delete user")
    public String setApiEndpoint() {
        return url + "posts/1 ";
    }

    @Step("I send request to delete user")
    public void sendDeleteUserRequest() {
        SerenityRest.given().delete(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set invalid API endpoint for delete user")
    public String setInvalidApiEndpoint() {
        return url + "";
    }
}

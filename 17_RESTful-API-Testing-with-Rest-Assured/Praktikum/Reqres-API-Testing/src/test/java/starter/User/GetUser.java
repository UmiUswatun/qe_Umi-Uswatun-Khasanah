package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matcher;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import java.lang.reflect.Array;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetUser {
    private static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set valid API endpoint for get user data")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get user data")
    public void sendValidRequest() {
        SerenityRest.given().get(setValidAPIEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for user data")
    public void receiveValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://jsonplaceholder.typicode.com/invalid";

    @Step("I set invalid API endpoint for get user data")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get user data 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get user data")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }

    @Step("I receive status code 404")
    public void receiveStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
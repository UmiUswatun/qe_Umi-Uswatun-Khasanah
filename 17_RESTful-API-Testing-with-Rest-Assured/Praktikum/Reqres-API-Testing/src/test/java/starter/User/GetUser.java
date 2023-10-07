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
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set valid API endpoint for get user")
    public String setValidApiEndpoint() {
        return url + "posts";
    }

    @Step("I send request to get user")
    public void sendGetUserRequest() {
        SerenityRest.given().get(setValidApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for user")
    public void receiveValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'userId'",everyItem(equalTo(1))));
        restAssuredThat(response -> response.body("'id'", everyItem(greaterThan(0))));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set valid API endpoint for get user")
    public String setInvalidApiEndpoint() {return url;}

    @Step("I receive status code 404")
    public void receiveInvalidStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
package starter.user.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUser {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for get user data")
    public String setValidAPIEndpointForGetUserData() {
        return url + "users";
    }

    @Step("I get valid user data")
    public void getValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for get user data")
    public void setInvalidAPIEndpointForGetUserData(){
    }
}

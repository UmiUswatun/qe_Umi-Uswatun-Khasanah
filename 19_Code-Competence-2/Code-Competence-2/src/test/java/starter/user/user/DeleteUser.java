package starter.user.user;

import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class DeleteUser {
    public static String urldeluser = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for delete user data")
    public String setValidAPIEndpointForDeleteUser() {
        return urldeluser + "users/6";
    }

    @Step("I can delete user data")
    public void canDeleteUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    private static String urlinvdeluser = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for delete user data")
    public String setInvalidAPIEndpointForDeleteUserData() {
        return urlinvdeluser;
    }
}

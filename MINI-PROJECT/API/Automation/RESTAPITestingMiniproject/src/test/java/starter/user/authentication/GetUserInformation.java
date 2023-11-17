package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInformation {
    private static String url = "https://altashop-api.fly.dev/api/auth/info";

    @Step("I set valid API endpoint for get get user Information")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get get user Information")
    public void sendValidRequest() {

        String data = GenerateToken.generateToken();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + data)
                .get(setValidAPIEndpoint());

    }



    @Step("I receive valid data for get user Information")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_INFORMATION_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get user Information")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get user Information 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get user Information")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }
}

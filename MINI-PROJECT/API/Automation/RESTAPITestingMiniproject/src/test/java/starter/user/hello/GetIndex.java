package starter.user.hello;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIndex {
    private static String url = "https://altashop-api.fly.dev/api/hello";

    @Step("I set valid API endpoint for get index")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get index")
    public void sendValidRequest() {
        SerenityRest.given().get(setValidAPIEndpoint());
    }

    @Step("I receive valid data for index")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_INDEX_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get index")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get index 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get index")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }
}


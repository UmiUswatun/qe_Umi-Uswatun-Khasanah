package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProduct {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set valid API endpoint for get all product")
    public String setValidAPIEndpoint() {
        return url + "products";
    }

    @Step("I send valid request to get all product")
    public void sendValidRequest() {
        SerenityRest.given().get(setValidAPIEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for all product")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_PRODUCT_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get all product")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get all product 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get all product")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }

    @Step("I receive status code 405")
    public void receiveStatusCode405() {
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I receive status code 404")
    public void receiveStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

}

package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRating {
    private static String url = "https://altashop-api.fly.dev/api/products/2/ratings";

    @Step("I set valid API endpoint for get product rating")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get product rating")
    public void sendValidRequest() {
        SerenityRest.given().get(setValidAPIEndpoint());
    }

    @Step("I receive valid data for product rating")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_PRODUCT_RATING_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get product rating")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get product rating 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get product rating")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }
}

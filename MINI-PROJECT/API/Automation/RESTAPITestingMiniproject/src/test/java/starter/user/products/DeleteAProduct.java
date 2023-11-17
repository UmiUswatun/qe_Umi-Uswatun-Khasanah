package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAProduct {
    private static String url = "https://altashop-api.fly.dev/api/products/1";

    @Step("I set valid API endpoint for delete a product")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to delete a product")
    public void sendValidRequest() {
        SerenityRest.given().delete(setValidAPIEndpoint());
    }

    @Step("I receive valid data for delete a product")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_A_PRODUCT_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for delete a product")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to delete a product 1")
    public void sendValidRequest1() {
        SerenityRest.given().delete(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to delete a product")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }
}

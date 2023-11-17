package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAComment {
    private static String url = "https://altashop-api.fly.dev/api/products/2/comments";

    @Step("I set valid API endpoint for get comment")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get comment")
    public void sendValidRequest() {
        SerenityRest.given().get(setValidAPIEndpoint());
    }

    @Step("I receive valid data for comment")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_A_COMMENT_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get comment")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get comment 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get comment")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }
}

package starter.user.productcategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {

    private static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set valid API endpoint for get all categories")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get all categories")
    public void sendValidRequest() {
        SerenityRest.given().get(setValidAPIEndpoint());
    }

    @Step("I receive valid data for all categories")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CATEGORIES_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get all categories")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get all categories 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get all categories")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }

}

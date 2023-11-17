package starter.user.products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductById {
    private static String url = "https://altashop-api.fly.dev/api/products/1";

    @Step("I set valid API endpoint for get product by id")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get product by id")
    public void sendValidRequest() {SerenityRest.given().get(setValidAPIEndpoint());
    }

    @Step("I receive valid data for product id")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_PRODUCT_BY_ID_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get product by id")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get product by id 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get product by id")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }
}
package starter.user.orders;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {

    public static String Token = "";
    private static String url = "https://altashop-api.fly.dev/api/orders";

    @Step("I set valid API endpoint for get all order")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send valid request to get all order")
    public void sendValidRequest() {
        RestAssured.given()
                .header(new Header("Authorization", "Bearer " + Token))
                .contentType("application/json")
                .get(setValidAPIEndpoint());
    }

    @Step("I receive valid data for all order")
    public void receiveValidProductData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_ORDER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I set invalid API endpoint for get all order")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send valid request to get all order 1")
    public void sendValidRequest1() {
        SerenityRest.given().get(setInvalidAPIEndpoint());
    }

    @Step("I send invalid request to get all order")
    public void sendInvalidRequest() {
        SerenityRest.given().put(setInvalidAPIEndpoint());
    }

}

package starter.user.cart;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateCart {

    private static String urlcartupdate = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for update cart data")
    public String setValidAPIEndpointForUpdateCart() {
        return urlcartupdate + "carts/7";
    }

    @Step("I send request for update cart data with valid input")
    public void sendValidRequestForUpdateCart() {
        JSONObject requestBody = new JSONObject();

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .put(urlcartupdate);
    }

    @Step("I can update cart data")
    public void canUpdateCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_CART_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String urlcartinv = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for update cart data")
    public String setInvalidAPIEndpointForUpdateCart() {
        return urlcartinv;
    }

    @Step("I send request for update cart data with invalid input")
    public void sendInvalidRequestForUpdateCart(){
        JSONObject requestBody = new JSONObject();

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .put(urlcartinv);
    }

}

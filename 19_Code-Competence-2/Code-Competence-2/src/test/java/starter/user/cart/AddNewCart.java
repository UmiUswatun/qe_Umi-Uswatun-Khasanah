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

public class AddNewCart {
    private static String addcarturl = "https://fakestoreapi.com/products";

    @Step("I set valid API endpoint for add new user")
    public String setValidAPIEndpointForAddNewCart() {
        return addcarturl + "carts";
    }

    @Step("I send request for add new cart with valid input")
    public void sendValidRequestForAddNewCart() {
        JSONObject requestBody = new JSONObject();

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .post(addcarturl);
    }

    @Step("I receive status code 200 for add new cart")
    public void receiveCodeForAddCart200() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I can add new cart")
    public void addNewCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_CART_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url3 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for add new cart")
    public void setInvalidAPIEndpointForAddNewCart(){
    }

    @Step("I send request for add new cart with invalid input")
    public void sendInvalidRequestForAddNewCart() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(url3);
    }



}

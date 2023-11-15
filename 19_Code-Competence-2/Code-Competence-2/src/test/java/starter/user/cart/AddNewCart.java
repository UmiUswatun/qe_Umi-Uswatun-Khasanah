package starter.user.cart;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class AddNewCart {
    private static String url = "https://fakestoreapi.com/carts";

    @Step("I set valid API endpoint for add new user")
    public String setValidAPIEndpointForAddNewCart() {
        return url;
    }

    @Step("I send request for add new cart with valid input")
    public Response sendValidRequestForAddNewCart() {
        JSONObject requestBody = new JSONObject();
        JSONArray productsArray = new JSONArray();

        requestBody.put("userId", 5);
        requestBody.put("date:", "2020-02-03");

        JSONObject product1 = new JSONObject();
        product1.put("productId", 5);
        product1.put("quantity", 1);
        productsArray.put(product1);

        JSONObject product2 = new JSONObject();
        product2.put("productId", 1);
        product2.put("quantity", 5);
        productsArray.put(product2);

        requestBody.put("products", productsArray);

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .post(setValidAPIEndpointForAddNewCart());
        return response;
    }


    @Step("I can add new cart")
    public void addNewCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_CART_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url3 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for add new cart")
    public String setInvalidAPIEndpointForAddNewCart() {return url3;}


    @Step("I send request for add new cart with invalid input")
    public void sendInvalidRequestForAddNewCart() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setInvalidAPIEndpointForAddNewCart());
    }



}

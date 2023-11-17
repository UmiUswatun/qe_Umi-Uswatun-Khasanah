package starter.user.orders;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import io.restassured.http.Header;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewOrder {

    private static String url = "https://altashop-api.fly.dev/api/orders";

    public static String Token = "";

    @Step("I set valid API endpoint for create a new order")
    public String setValidAPIEndpoint() {return url;}

    @Step("I send request to create a new order with valid inputs")
    public void sendValidRequest() {
        String body = "{\n" +
                "        \"product_id\": 1212,\n" +
                "        \"quantity\":1\n" +
                "    }";


       RestAssured.given()
                .header(new Header("Authorization", "Bearer " + Token))
                .contentType("application/json")
                .body(body)
                .post(setValidAPIEndpoint());

    }

    @Step("I receive status code 401")
    public void receiveStatusCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I receive valid data for create a new order")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_NEW_ORDER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I send request to create a new order with invalid inputs")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .delete(setInvalidAPIEndpoint());
    }

    @Step("I set invalid API endpoint for create a new order")
    public String setInvalidAPIEndpoint() {return url1;}

    @Step("I send request to create a new order with valid inputs 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setInvalidAPIEndpoint());
    }
}


package starter.user.user;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AddUser {
    private static String userurl = "https://fakestoreapi.com/products";

    @Step("I set valid API endpoint for add new user")
    public String setValidAPIEndpointForAddUser() {
        return userurl + "users";
    }

    @Step("I send request for add new user with valid input")
    public void sendValidRequestForAddNewUser() {
        JSONObject requestBody = new JSONObject();

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .post(userurl);
    }

    @Step("I can add new user")
    public void addNewUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url3 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for add new user")
    public String setInvalidAPIEndpointForAddNewUser(){
        return url3;
    }

    @Step("I receive status code 404 for add user data")
    public void getStatusCode() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send request for add new user with invalid input")
    public void sendInvalidRequestForAddNewUser() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(url3);
    }



}

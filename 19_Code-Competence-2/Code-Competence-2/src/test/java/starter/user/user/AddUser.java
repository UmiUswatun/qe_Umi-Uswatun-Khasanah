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
        JSONObject userData = new JSONObject();

        userData.put("email", "John@gmail.com");
        userData.put("username", "johnd");
        userData.put("password", "m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname", "John");
        name.put("lastname", "Doe");

        userData.put("name", name);

        JSONObject address = new JSONObject();
        address.put("city", "kilcoole");
        address.put("street", "7835 new road");
        address.put("number", 3);
        address.put("zipcode", "12926-3874");

        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-37.3159");
        geolocation.put("long", "81.1496");

        address.put("geolocation", geolocation);

        userData.put("address", address);

        userData.put("phone", "1-570-236-7033");



        RestAssured.given()
                .header("contentType", "application/json")
                .body(userData.toString())
                .post(setValidAPIEndpointForAddUser());
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
                .post(setInvalidAPIEndpointForAddNewUser());
    }



}

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

public class UpdateUser {

    private static String urluserupdate = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for update user data")
    public String setValidAPIEndpointForUpdateUser() {
        return urluserupdate + "users/7";
    }

    @Step("I send request for update user data with valid input")
    public void sendValidRequestForUpdateUser() {
        JSONObject requestBody = new JSONObject();

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .put(urluserupdate);
    }

    @Step("I can update user data")
    public void canUpdateUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String urluserinv = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for update user data")
    public String setInvalidAPIEndpointForUpdateUser() {
        return urluserinv;
    }

    @Step("I receive status code 404 for update user data")
    public void getStatuscode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send request for update user data with invalid input")
    public void sendInvalidRequestForUpdateUser(){
        JSONObject requestBody = new JSONObject();

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .put(urluserinv);
    }

}

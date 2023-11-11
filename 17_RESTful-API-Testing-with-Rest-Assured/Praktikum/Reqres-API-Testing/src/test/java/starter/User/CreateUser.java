package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class CreateUser {
    private static String url = "https://jsonplaceholder.typicode.com/posts";
    private static String url1 = "https://jsonplaceholder.typicode.com/invalid";

    @Step("I set valid API endpoint for create user")
    public String setApiEndpoint() {
        return url;
    }

    @Step("I send request to create user with valid inputs")
    public void sendCreateUserRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId",1);
        requestBody.put("id", 1);
        requestBody.put("title", "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }

    @Step("I receive status code 201")
    public void receiveStatusCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for created user")
    public void receiveValidCreatedUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I receive id")
    public void receiveValidId() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_USER_RESPONSE_SCHEMA1);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set invalid API endpoint for create user")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send request to create user with invalid inputs")
    public void sendInvalidCreateUserRequest() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .get(setInvalidAPIEndpoint());
    }

    @Step("I send request to create user with valid inputs 1")
    public void sendInvalidCreateUserRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId",1);
        requestBody.put("id", 1);
        requestBody.put("title", "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setInvalidAPIEndpoint());
    }

    @Step("I send request to create user with invalid inputs 2")
    public void sendInvalidCreateUserRequest2() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }

}
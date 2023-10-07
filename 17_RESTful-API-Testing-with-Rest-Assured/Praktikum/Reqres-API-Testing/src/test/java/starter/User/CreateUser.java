package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class CreateUser {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set valid API endpoint for create user")
    public String setApiEndpoint() {
        return url + "posts";
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

        restAssuredThat(response -> response.body("'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set invalid API endpoint for create user")
    public String setInvalidApiEndpoint() {
        return url + "psts";
    }

    @Step("I receive status code 404")
    public void receiveInvalidStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send request to create user with invalid inputs")
    public void sendInvalidCreateUserRequest() {
    }

    @Step("I receive status code 500")
    public void receiveInvalidStatusCode500() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I receive syntax error message")
    public void receiveSyntaxErrorMessage() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'userId'", nullValue()));
        restAssuredThat(response -> response.body("'id'", nullValue()));
        restAssuredThat(response -> response.body("'title'", nullValue()));
        restAssuredThat(response -> response.body("'body'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
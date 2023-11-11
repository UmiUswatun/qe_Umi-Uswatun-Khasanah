package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class UpdateUser {
    private static String url = "https://jsonplaceholder.typicode.com/posts/1";

    private static String url1= "https://jsonplaceholder.typicode.com/invalid";

    @Step("I set valid API endpoint for update user")
    public String setApiEndpoint() {
        return url;
    }

    @Step("I send request to update user with valid inputs")
    public void sendUpdateUserRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId",1);
        requestBody.put("id", 1);
        requestBody.put("title", "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put( setApiEndpoint());
    }

    @Step("I receive valid data for created user")
    public void receiveValidUpdateUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I receive id for update user")
    public void receiveValidId() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_RESPONSE_SCHEMA1);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set invalid API endpoint for update user")
    public String setInvalidAPIEndpoint() {
        return url1;
    }

    @Step("I send request to update user with invalid inputs")
    public void sendInvalidUpdateUserRequest() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .get(setInvalidAPIEndpoint());
    }

    @Step("I send request to update user with valid inputs 1")
    public void sendInvalidUpdateUserRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId",1);
        requestBody.put("id", 1);
        requestBody.put("title", "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setInvalidAPIEndpoint());
    }

    @Step("I send request to update user with invalid inputs 2")
    public void sendInvalidUpdateUserRequest2() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }
}
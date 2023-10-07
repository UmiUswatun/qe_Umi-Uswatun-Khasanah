package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class UpdateUser {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set valid API endpoint for update user")
    public String setApiEndpoint() {
        return url + "posts/1 ";
    }

    @Step("I send request to update user with valid inputs")
    public void sendUpdateUserRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", 1);
        requestBody.put("Id",1);
        requestBody.put("title","sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }

    @Step("I receive valid data for updated user")
    public void receiveValidUpdatedUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(greaterThan(0))));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I set invalid API endpoint for update user")
    public String setInvalidApiEndpoint() {
        return url + "psts/1 ";
    }

    @Step("I send request to update user with invalid inputs")
    public void sendInvalidUpdateUserRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId", nullValue());
        requestBody.put("Id",1);
        requestBody.put("title","sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
        requestBody.put("body","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }
}
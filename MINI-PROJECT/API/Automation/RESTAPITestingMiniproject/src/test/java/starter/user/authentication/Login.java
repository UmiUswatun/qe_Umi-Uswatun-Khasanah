package starter.user.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    private static String url = "https://altashop-api.fly.dev/api/auth/login";

    @Step("I set valid API endpoint for login")
    public String setValidAPIEndpoint() {return url;}

    @Step("I send request to login")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidAPIEndpoint());
    }

    @Step("I can login")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I send invalid request to login")
    public void sendInvalidrequest() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .delete(setInvalidAPIEndpoint());
    }

    @Step("I set invalid API endpoint for login")
    public String setInvalidAPIEndpoint() {return url1;}

    @Step("I send request to login 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setInvalidAPIEndpoint());
    }
}


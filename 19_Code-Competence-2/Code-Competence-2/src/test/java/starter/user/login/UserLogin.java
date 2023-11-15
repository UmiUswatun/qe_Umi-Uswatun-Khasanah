package starter.user.login;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class UserLogin {
    private static String url = "https://fakestoreapi.com/auth/login";

    @Step("I set valid API endpoint")
    public String setValidAPIEndpoint() {
        return url;
    }

    @Step("I send request with valid input")
    public void sendValidRequest() {
        JSONObject responBody = new JSONObject();

        responBody.put("username", "mor_2314");
        responBody.put("password", "83r5^_");

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(responBody.toString())
                .post(setValidAPIEndpoint());
    }

    @Step("I get the token for login")
    public void getTheToken() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.USER_LOGIN_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'token'", notNullValue()));

    }

    private static String url1 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint")
    public String setInvalidAPIEndpoint() {return url1;}

    @Step("I send request with invalid input")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setInvalidAPIEndpoint());
    }
    @Step("I got an error message")
    public String getErrorMessage() {
        return null;
    }
}

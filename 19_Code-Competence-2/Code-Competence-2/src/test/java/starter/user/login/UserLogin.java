package starter.user.login;

import io.cucumber.java.fr.Sachantque;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class UserLogin {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint")
    public String setValidAPIEndpoint() {
        return url + "auth/login";
    }

    @Step("I send request with valid input")
    public void sendValidRequest() {
        JSONObject userData = new JSONObject();
        userData.put("username", "mor_2314");
        userData.put("password", "83r5^_");

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(userData)
                .post(url);
    }

    @Step("I receive status code 200 for login")
    public void receiveStatusCode200ForLogin() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I get the token for login")
    public void getTheToken() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.USER_LOGIN_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'token'", notNullValue()));

    }

    private static String url1 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint")
    public void setInvalidAPIEndpoint() {
    }

    @Step("I send request with invalid input")
    public void sendInvalidRequest() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(url1);
    }

    @Step("I receive status code 404")
    public void receiveStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I got an error message")
    public String getErrorMessage() {
        return null;
    }
}

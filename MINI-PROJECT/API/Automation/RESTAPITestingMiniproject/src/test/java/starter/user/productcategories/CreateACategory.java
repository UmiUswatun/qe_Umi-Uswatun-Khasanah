package starter.user.productcategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateACategory {
    private static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("I set valid API endpoint for create a new category")
    public String setValidAPIEndpoint() {return url;}

    @Step("I send request to create a new category with valid inputs")
    public void sendValidRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setValidAPIEndpoint());
    }

    @Step("I receive valid data for create a new category")
    public void receiveValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_CATEGORY_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://altashop-api.fly.dev/api/invalid";

    @Step("I send request to create a new category with invalid inputs")
    public void sendInvalidrequest() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .delete(setInvalidAPIEndpoint());
    }

    @Step("I set invalid API endpoint for create a new category")
    public String setInvalidAPIEndpoint() {return url1;}

    @Step("I send request to create a new category with valid inputs 1")
    public void sendValidRequest1() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setInvalidAPIEndpoint());
    }
}


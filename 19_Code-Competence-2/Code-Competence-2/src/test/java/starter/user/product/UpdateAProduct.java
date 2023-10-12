package starter.user.product;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateAProduct {

    private static String url4 = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for update a product")
    public String setValidAPIEndpointForUpdateProduct() {
        return url4 + "products/7";
    }

    @Step("I send request for update a product with valid input")
    public void sendValidRequestForUpdateProduct() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "test product");
        requestBody.put("price", 13.5);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .put(url4);
    }

    @Step("I can update a product")
    public void canUpdateAProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_A_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url5 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for update a product")
    public void setInvalidAPIEndpointForUpdateProduct() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(url5);
    }

    @Step("I send request for update a product with invalid input")
    public void sendInvalidRequestForUpdateProduct(){
        JSONObject requestBody = new JSONObject();

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .put(url4);
    }

}

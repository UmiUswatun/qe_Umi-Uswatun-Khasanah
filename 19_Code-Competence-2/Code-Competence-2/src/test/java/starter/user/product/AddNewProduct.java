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

public class AddNewProduct {
    private static String url2 = "https://fakestoreapi.com/products";

    @Step("I set valid API endpoint for data product")
    public String setValidAPIEndpointForAddNewProduct() {
        return url2;
    }

    @Step("I send request for add new product with valid input")
    public void sendValidRequestForAddNewProduct() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "test product");
        requestBody.put("price", 13.5);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        Response response = RestAssured.given()
                .header("contentType", "application/json")
                .body(requestBody)
                .post(setValidAPIEndpointForAddNewProduct());
    }

    @Step("I can add new product")
    public void addNewProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url3 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for add new product")
    public String sendInvalidRequestForAddNewProduct(){return url3;
    }

    @Step("I set invalid API endpoint for add new product")
    public void setInvalidAPIEndpointForAddNewProduct() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(sendInvalidRequestForAddNewProduct());
    }



}

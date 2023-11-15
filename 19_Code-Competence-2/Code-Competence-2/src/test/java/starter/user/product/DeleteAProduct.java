package starter.user.product;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertTrue;

public class DeleteAProduct {
    public static String urldelprod = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for delete a product")
    public String setValidAPIEndpointForDelete() {
        return urldelprod + "products/6";
    }

    @Step("I send valid request for delete product")
    public void sendValidRequest() {
        SerenityRest.given().delete(setValidAPIEndpointForDelete());}

    @Step("I can delete a product")
    public void canDeleteAProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_A_PRODUCT_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    private static String urlinvdelprod = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for delete a product")
    public String setInvalidAPIEndpointForDelete() {return urlinvdelprod;
    }

    @Step("I send invalid request for delete product")
    public void sendInvalidRequest() {
        SerenityRest.given().delete(setInvalidAPIEndpointForDelete());}


}

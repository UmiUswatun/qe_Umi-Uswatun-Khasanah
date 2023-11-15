package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProduct {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for data product")
    public String setValidAPIEndpointForDataProduct() {
        return url + "products";
    }

    @Step("I send valid request")
    public void sendValidRequest () {
        SerenityRest.given().get(setValidAPIEndpointForDataProduct());
    }

    @Step("I get valid data for all product")
    public void getValidData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_PRODUCT_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String url1 = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for data product")
    public String setInvalidAPIEndpointForDataProduct(){return url1;}

    @Step("I send invalid request")
    public void sendInvalidRequest () {
        SerenityRest.given().get(setInvalidAPIEndpointForDataProduct());
    }

    @Step("I receive status code 404")
    public void receiveStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}

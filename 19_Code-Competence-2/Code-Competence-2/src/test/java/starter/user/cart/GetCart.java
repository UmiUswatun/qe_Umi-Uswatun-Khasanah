package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCart {
    private static String urlcart = "https://fakestoreapi.com/";

    @Step("I set valid API endpoint for get cart data")
    public String setValidAPIEndpointForGetCartData() {
        return urlcart + "carts";
    }

    @Step("I send valid request for delete cart")
    public void sendValidRequest () {
        SerenityRest.given().get(setValidAPIEndpointForGetCartData());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I get valid cart data")
    public void getValidUserCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_CART_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    private static String urlinvcart = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for get cart data")
    public String setInvalidAPIEndpointForGetCartData(){
        return urlinvcart;
    }

    @Step("I send invalid request for get new cart")
    public void sendInvalidRequest() {
        SerenityRest.given().delete(setInvalidAPIEndpointForGetCartData());
    }
}

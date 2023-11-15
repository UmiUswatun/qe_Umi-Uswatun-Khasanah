package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCart {
    public static String urldelcart = "https://fakestoreapi.com/carts/6";

    @Step("I set valid API endpoint for delete cart")
    public String setValidAPIEndpointForDeleteCart() {
        return urldelcart;
    }

    @Step("I send valid request for delete cart")
    public void sendValidRequest () {
        SerenityRest.given().delete(setValidAPIEndpointForDeleteCart());
    }

    @Step("I can delete cart")
    public void canDeleteCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_CART_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    private static String urlinvdelcart = "https://fakestoreapi.com/invalid";

    @Step("I set invalid API endpoint for delete cart")
    public String setInvalidAPIEndpointForDeleteCart() {
        return urlinvdelcart;
    }

    @Step("I send invalid request")
    public void sendInvalidRequest () {
        SerenityRest.given().delete(setInvalidAPIEndpointForDeleteCart());
    }


}

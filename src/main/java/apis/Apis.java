package apis;

import enums.Services;
import io.restassured.response.ValidatableResponse;
import specification.RequestSpecificationFactory;
import specification.ResponseSpecificationFactory;

import static io.restassured.RestAssured.*;

public class Apis {

    public static final Apis apis = new Apis();

    public ValidatableResponse consultarAnimals(){

        return given()
                .spec(RequestSpecificationFactory.createRequestSpecification(Services.BASE_URL_API.getUrl()))
                .when()
                .get("/fact")
                .then()
                .spec(ResponseSpecificationFactory.createResponseSpecification());
    }


    //facts/
}

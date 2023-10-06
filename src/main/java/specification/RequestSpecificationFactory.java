package specification;

import io.restassured.specification.RequestSpecification;
import properties.PropertiesLoader;



public class RequestSpecificationFactory {
    private static PropertiesLoader propertiesLoader = null;

    public RequestSpecificationFactory(PropertiesLoader propertiesLoader) {
        RequestSpecificationFactory.propertiesLoader = propertiesLoader;
    }

    public static RequestSpecification createRequestSpecification(String urlService) {
        return RestAssuredConfigurator.getRequestBuilder()
                .setBaseUri(propertiesLoader.getUrlBase(urlService)).build();
    }

}

package specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

public class RestAssuredConfigurator {

    public static RequestSpecBuilder getRequestBuilder() {
        return new RequestSpecBuilder()
                .setConfig(
                        RestAssuredConfig.config().logConfig(LogConfig.logConfig()
                                .enablePrettyPrinting(true)
                                .enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL)
                        )
                ).setRelaxedHTTPSValidation()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .log(LogDetail.ALL);
    }
}

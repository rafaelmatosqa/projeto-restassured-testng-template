package specification;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.ResponseSpecification;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ResponseSpecificationFactory {

    public static ResponseSpecification createResponseSpecification() {
        return new ResponseSpecBuilder().log(LogDetail.ALL).build();

    }
}

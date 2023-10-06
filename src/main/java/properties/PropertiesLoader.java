package properties;

import env.Environment;
import org.apache.commons.lang3.ArrayUtils;

public class PropertiesLoader {

    private final Environment environment;

    public PropertiesLoader(Environment environment) {
        this.environment = environment;
    }

    public String getUrlBase(String urlBase) {
        return String.format(urlBase, environment);
    }
}

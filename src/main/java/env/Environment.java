package env;

import enums.Env;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;


import static enums.Env.UAT;

@UtilityClass
public class Environment {

    public static Env get() {
        String env = System.getProperty("env");

        if (StringUtils.isEmpty(env)) {
            env = UAT.name(); // Valor padrão é UAT
        }

        try {
            return Env.valueOf(env.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unexpected value: " + env);
        }
    }
}

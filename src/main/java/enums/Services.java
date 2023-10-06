package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Services {

    BASE_URL_API("https://%s.herokuapp.com");

    public final String url;
}

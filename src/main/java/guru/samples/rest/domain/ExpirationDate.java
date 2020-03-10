package guru.samples.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class ExpirationDate implements Serializable {

    private final static long serialVersionUID = 4661228813349752965L;

    private String date;
    private Integer timezoneType;
    private String timezone;
    private Map<String, Object> additionalProperties = new HashMap<>();
}

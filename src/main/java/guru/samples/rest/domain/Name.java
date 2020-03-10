package guru.samples.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Name implements Serializable {

    private final static long serialVersionUID = 420620315591775395L;

    private String title;
    private String first;
    private String last;
    private Map<String, Object> additionalProperties = new HashMap<>();
}

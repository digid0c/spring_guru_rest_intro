package guru.samples.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Job implements Serializable {

    private final static long serialVersionUID = -4985150429002262656L;

    private String title;
    private String company;
    private Map<String, Object> additionalProperties = new HashMap<>();
}

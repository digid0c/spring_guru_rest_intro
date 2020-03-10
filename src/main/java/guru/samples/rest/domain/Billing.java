package guru.samples.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Billing implements Serializable {

    private final static long serialVersionUID = 6577338081290507077L;

    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<>();
}

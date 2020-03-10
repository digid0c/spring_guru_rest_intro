package guru.samples.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Card implements Serializable {

    private final static long serialVersionUID = 6203456183354582742L;

    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
    private Map<String, Object> additionalProperties = new HashMap<>();
}

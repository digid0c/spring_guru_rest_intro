package guru.samples.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Login implements Serializable {

    private final static long serialVersionUID = 1041720428871730372L;

    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
    private Map<String, Object> additionalProperties = new HashMap<>();
}

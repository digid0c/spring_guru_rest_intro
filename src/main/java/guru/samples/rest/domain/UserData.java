package guru.samples.rest.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserData implements Serializable {

    private final static long serialVersionUID = -2305480151018958503L;

    List<User> data = new ArrayList<>();
}

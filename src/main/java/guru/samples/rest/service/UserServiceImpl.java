package guru.samples.rest.service;

import guru.samples.rest.domain.User;
import guru.samples.rest.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

@Service
public class UserServiceImpl implements UserService {

    private static final String USER_API_URL = "http://apifaketory.com/api/user?limit=";

    private RestTemplate restTemplate;

    @Autowired
    public UserServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject(USER_API_URL + limit, UserData.class);
        return ofNullable(userData)
                .map(UserData::getData)
                .orElse(new ArrayList<>());
    }
}

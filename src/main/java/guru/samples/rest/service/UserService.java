package guru.samples.rest.service;

import guru.samples.rest.domain.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(Integer limit);
}

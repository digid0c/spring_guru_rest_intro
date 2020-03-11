package guru.samples.rest.service;

import guru.samples.rest.domain.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@Disabled("Apifaketory no longer supports retrieving users data")
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceIntegrationTest {

    private static final Integer LIMIT = 3;
    private static final Integer ACTUAL_AMOUNT = 4;

    @Autowired
    private UserService tested;

    @Test
    public void shouldGetUsers() {
        List<User> users = tested.getUsers(LIMIT);

        assertThat(users, is(notNullValue()));
        assertThat(users.size(), is(equalTo(ACTUAL_AMOUNT)));
    }
}

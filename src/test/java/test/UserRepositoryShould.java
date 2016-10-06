package test;

import org.junit.Test;
import webService.userRepository.UserRepository;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hp omen on 05/10/2016.
 */
public class UserRepositoryShould {
    @Test
    public void name() throws Exception {
        UserRepository user = new UserRepository();
        assertThat(user.addUser("yonay").toString(),is("User{name='yonay'}"));

    }
}

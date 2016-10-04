package webService.userservices;

import webService.userRepository.UserRepository;
import static spark.Spark.*;

/**
 * Created by yon on 29/09/2016.
 */
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    private void services(){

    }
}

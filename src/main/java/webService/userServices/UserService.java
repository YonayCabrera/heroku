package webService.userServices;

import spark.Request;
import webService.controller.User;
import webService.userRepository.UserRepository;

/**
 * Created by yon on 29/09/2016.
 */
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }


    public User createUser(Request request) {
        return UserRepository.addUser(request.queryParams("user"));
    }


}

package webService.userservices;

import webService.userRepository.UserRepository;

/**
 * Created by yon on 29/09/2016.
 */
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }
}

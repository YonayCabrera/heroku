package webService.userRepository;

import spark.Request;
import webService.controller.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yon on 29/09/2016.
 */
public class UserRepository {

    private static Map<Integer,User> users = new HashMap<>();
    private static int idUser=0;


    public static User addUser(Request request) {
        User user = new User(idUser++,request.queryParams("user"));
        users.put(user.getId(),user);
        return users.get(user.getId());
    }
}

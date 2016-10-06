package webService.controller;

import webService.userServices.UserService;

import static spark.Spark.post;

/**
 * Created by yon on 29/09/2016.
 */
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
        apply();
    }

    private void apply(){
        post("/users", (request, response) -> userService.createUser(request), Object::toString);
    }

}

package webService.controller;

import webService.userservices.UserService;

/**
 * Created by yon on 29/09/2016.
 */
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }
}

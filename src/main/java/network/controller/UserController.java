package network.controller;

import network.model.User;
import network.service.UserService;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserService();
        User[] users = userService.getAll();

        for (User elem: users) {
            System.out.println(elem);
        }
    }
}

package com.wxl.controller;

import com.wxl.entity.User;
import com.wxl.service.UserService;

public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUserById(int id) {
        return userService.getUserById(id);
    }
}

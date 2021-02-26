package com.wxl.controller;

import com.wxl.entity.User;
import com.wxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    @Qualifier("myTestUserService")
    private UserService userService;

    public User getUserById(int id) {
        return userService.getUserById(id);
    }
}

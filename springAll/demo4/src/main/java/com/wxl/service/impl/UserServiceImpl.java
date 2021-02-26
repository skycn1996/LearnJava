package com.wxl.service.impl;

import com.wxl.dao.UserDAO;
import com.wxl.entity.User;
import com.wxl.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }
}

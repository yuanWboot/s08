package com.zy.spring.ioc.service;

import com.zy.spring.ioc.dao.UserDao;



public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

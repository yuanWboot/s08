package com.zy.spring.ioc.service;

import com.zy.spring.ioc.dao.EmployeeDao;
import com.zy.spring.ioc.dao.UserDao;



public class UserService {

    private UserDao userDao;
    private EmployeeDao employeeDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}

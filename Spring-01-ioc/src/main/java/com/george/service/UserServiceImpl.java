package com.george.service;

import com.george.dao.UserDao;
import com.george.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao ;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}

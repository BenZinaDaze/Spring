package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.service.UserService;

public class UserServiceImpl implements UserService {

    //BeanFactory 去调用方法，从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao) {
        System.out.println("setUserDao方法: " + userDao);
    }
}

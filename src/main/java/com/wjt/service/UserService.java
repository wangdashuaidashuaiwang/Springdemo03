package com.wjt.service;

import com.wjt.dao.UserDao;

public class UserService {
    //创建userdao属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service added");
        userDao.update();
    }
}

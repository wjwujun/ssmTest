package com.ssm.demo.service;

import com.ssm.demo.dao.UserDao;
import com.ssm.demo.dao.impl.UserDaoImpl;
import com.ssm.demo.entity.User;

public class UserService {

    private UserDao userDao=new UserDaoImpl();

    public User login(String name,String pwd){

        return  userDao.login(name,pwd);
    }


    public void sayHi() {
        System.out.println("dddd");
    }
}

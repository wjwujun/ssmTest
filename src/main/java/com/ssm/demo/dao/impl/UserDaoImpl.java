package com.ssm.demo.dao.impl;

import com.ssm.demo.dao.UserDao;
import com.ssm.demo.entity.User;

public class UserDaoImpl implements UserDao {

    public User login(String name, String pwd) {
        User user=null;
        if ("admin".equals(name)) {
            if ("admin".equals(pwd)) {
                user = new User();
                user.setName(name);
                user.setPwd(pwd);

                return user;
            }
        }
        return user;
    }


}

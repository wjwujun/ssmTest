package com.ssm.demo.dao;

import com.ssm.demo.entity.User;

public interface UserDao {

    public User login(String name, String pwd);
}

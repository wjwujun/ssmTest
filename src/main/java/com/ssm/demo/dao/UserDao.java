package com.ssm.demo.dao;

import com.ssm.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public User login(String name, String pwd);
    public List<User> selectAll();
}

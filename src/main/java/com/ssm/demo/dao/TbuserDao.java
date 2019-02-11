package com.ssm.demo.dao;

import com.ssm.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbuserDao {

     List<User> selectAll();
     void insert(User user);
     void del(int id);
}

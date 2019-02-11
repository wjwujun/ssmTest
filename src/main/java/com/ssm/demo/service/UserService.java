package com.ssm.demo.service;

import com.ssm.demo.dao.TbuserDao;
import com.ssm.demo.dao.UserDao;
import com.ssm.demo.dao.impl.UserDaoImpl;
import com.ssm.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    private UserDao userDao=new UserDaoImpl();


    @Autowired
    private TbuserDao tbuserDao;

    public User login(String name,String pwd){
        return  userDao.login(name,pwd);
    }

    public List<User> selectAll(){
            return tbuserDao.selectAll();
    }


    public void insert(){
        User user = new User();
        user.setUsername("aa");
        user.setPwd("aaaaa");
        user.setPhone("325345");
        user.setSalt("fsdfsdfsdfsdf");
        user.setCreated(new Date());
        tbuserDao.insert(user);
    }

    public void del(){
        tbuserDao.del(29);
    }

}

package com.ssm.demo.controller;


import com.ssm.demo.entity.User;
import com.ssm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {



        /*
        *
        * 跳转
        * */
        @RequestMapping(value ="main",method = RequestMethod.GET)
        public String main(){
                //返回视图
                return "mian";
        }



}

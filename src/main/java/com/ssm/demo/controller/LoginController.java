package com.ssm.demo.controller;


import com.ssm.demo.entity.User;
import com.ssm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class LoginController {

        @Autowired
        private UserService userService;

        private User user=new User();

        //默认和login都返回login
        @RequestMapping(value ={"","login"},method = RequestMethod.GET)
        public String login(){
                //返回视图
                return "login";
        }


        @GetMapping("select")
        @ResponseBody
        public List<User> selectAll(){
                System.out.println("-----------------------");
                System.out.println(userService.selectAll());
                return userService.selectAll();
        }

        @GetMapping("add")
        @ResponseBody
        public String add(){
                userService.insert();
                return "ok";
        }

        @GetMapping("del")
        @ResponseBody
        public String del(){
                userService.del();
                return "ok";
        }


/*    @RequestMapping(value ="login",method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String name,@RequestParam(required = true) String pwd,BindingResult result)
    {
            *//*
            *错误信息
                int errorCount = result.getErrorCount();
            * *//*




        if(user==null){     //登录失败
            return login();
        }else {             //登录成功，重定向
            return "redirect:/main";
        }

    }*/


    /*校验*/
 /*   @GetMapping("user")
    @ResponseBody
    public User AddUser(@RequestBody @Valid User userTemp){
        return user;
    }*/


    /*json*/
/*    @GetMapping("user")
    @ResponseBody
    public User getUser(@RequestBody User userTemp){
            user.setUsername("fsdf");
            user.setPwd("111");
        return user;
    }*/

    /*json*/
   /* @PostMapping("user")
    public User upload(MultipartFile pic, HttpServletRequest request) throws IOException {

        //存放文件路径
        String filePath = request.getSession().getServletContext().getRealPath("/static/upload");
        File dir = new File(filePath);
        if (!dir.exists()){
            dir.mkdir();
        }

        //图片名字
        String name = UUID.randomUUID().toString();
        //图片原来的名字
        String oldName = pic.getOriginalFilename();
        //图片后缀
        String sux = oldName.substring(oldName.lastIndexOf("."));

        File file = new File(dir, name + sux);

        //写入本地
        pic.transferTo(file);


        user.setUsername("fsdf");
        user.setPwd("111");
        return user;
    }*/


}

package com.ssm.demo.interceptor;

import com.ssm.demo.commons.ConstantUtils;
import com.ssm.demo.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 登录拦截器
* */
public class loginInterceptor implements HandlerInterceptor {


    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        //获取登录信息
        User user = (User) httpServletRequest.getSession().getAttribute(ConstantUtils.SESSION_USER);

        if(user==null) {         //如果没有登陆信息，就返回登陆
            httpServletResponse.sendRedirect("/login");
        }

        return true;//登陆后放行


    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {


    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

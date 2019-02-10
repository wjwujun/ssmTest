package com.ssm.demo.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*修改*/
public class customException implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                                         Exception e) {

        //自定义异常处理
        if(e instanceof myException){
            String msg = ((myException) e).getMsg();
        }

        String result="系统发生异常，请联系管理";
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg",result);
        mav.setViewName("msg");
        return mav;
    }
}

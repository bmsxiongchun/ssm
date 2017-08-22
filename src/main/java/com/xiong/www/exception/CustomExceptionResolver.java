package com.xiong.www.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //handler就是处理器适配器要执行的处理器（只有method方法）

        //1.解析出异常类型
        CustomException exception = null;
        //如果该异常类型是系统自定义的异常，直接取出异常信息，在错误页面展示
        if(ex instanceof CustomException) {
            exception = (CustomException) ex;
        }

        ModelAndView modelAndView = new ModelAndView();

        //将错误信息发送到页面
        modelAndView.addObject("message", exception.getMessage());

        //指定错误页面
        modelAndView.setViewName("error");
        return modelAndView;
    }
}

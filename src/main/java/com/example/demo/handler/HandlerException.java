package com.example.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName HandlerExceprion
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/7 15:58
 * @Version 1.0
 **/
@ControllerAdvice
public class HandlerException {


    @ExceptionHandler(Exception.class)
    Object ExceptionHandler(HttpServletRequest request,Exception e){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        System.out.println(e.getMessage());
        modelAndView.addObject("msg",e.getMessage());
        return modelAndView;

    }

}

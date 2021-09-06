package com.it.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author ZuYingFang
 * @time 2021-08-13 9:38
 */

@ControllerAdvice  // 将当前类表示为处理异常的组件
public class ExceptionController {

    // value是一个class数组
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public String testException(Exception exception, Model model){
        model.addAttribute("exceptionAttribute", exception);
        return "error";
    }

}

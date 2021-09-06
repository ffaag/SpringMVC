package com.it.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZuYingFang
 * @time 2021-08-10 10:37
 */

@Controller
public class TestController {

    /*@RequestMapping("/")
    public String testIndex(){
        return "index";
    }*/

    @RequestMapping("/test_restful")
    public String testIndex(){
        return "test_restful";
    }
}

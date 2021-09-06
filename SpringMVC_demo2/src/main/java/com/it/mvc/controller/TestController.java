package com.it.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZuYingFang
 * @time 2021-08-09 10:06
 */

@Controller
public class TestController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/param")
    public String testParam(){
        return "test_param";
    }
}

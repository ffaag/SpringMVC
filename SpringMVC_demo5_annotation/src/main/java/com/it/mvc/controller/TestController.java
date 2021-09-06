package com.it.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZuYingFang
 * @time 2021-08-13 10:51
 */

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}

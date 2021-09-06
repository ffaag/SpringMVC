package com.it.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZuYingFang
 * @time 2021-08-10 20:18
 */
@Controller
public class ViewController {

    @RequestMapping("/testView")
    public String testView(){
        return "test_view";
    }

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }


    // 没有前缀时是ThymeleafView，但是有的话就不是，只有两种forward和redirect
    // 比如现在要转发到上面那个请求时，如下所示用forward:/ ，这就不是ThymeleafView了
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }

    // 请求转发是一次浏览器请求，两次服务器请求，第二次请求可以访问内部资源
    // 请求重定向是两次浏览器请求，不可以访问内部资源，因此只能转发到请求里面，请求里面再去转发到内部资源
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }
}

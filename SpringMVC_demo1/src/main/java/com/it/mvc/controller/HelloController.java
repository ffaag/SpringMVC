package com.it.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZuYingFang
 * @time 2021-08-08 9:58
 */

@Controller
public class HelloController {

    //  页面的位置是/WEB-INF/templates/index.html

   @RequestMapping(value = "/")// 请求映射注解，作用是将当前的请求映射到这个方法来，里面的value表示当浏览器发送的是/匹配到这个方法
    public String index(){
        // 返回视图名称，因为我们直接访问不到页面，需要通过DispatcherServlet解析的视图来定位到页面
        // 这里定位的方法不是反射，因此和这个方法名是没有关系的，是通过视图名称来定位的
        // 注意，因为我们配置了Thmeleaf，里面已经定位好了前缀和后缀，因此我们看还需要什么就给什么

        return "index";

    }


    @RequestMapping(value = "/target")
    public String toTarget(){
       return "target";
    }

}

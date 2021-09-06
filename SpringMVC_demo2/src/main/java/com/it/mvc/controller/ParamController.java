package com.it.mvc.controller;

import com.it.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ZuYingFang
 * @time 2021-08-09 19:40
 */

@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        // 不建议用这个原生的
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        System.out.println(id + username);
        return "sucess";

    }


    @RequestMapping("/testParam")
    // 这里使用控制器方法的形参来传递参数，只要名称与前端中的键名相同即可String id, String username
    // 当不同时则使用注解@RequestParam
    public String testParam( String id,
                             @RequestParam(value = "user_name", defaultValue = "1", required = false) String username,
                             String []hobby){
        System.out.println(id + username  + Arrays.toString(hobby));
        return "sucess";
    }


    @RequestMapping("/testpojo")
    public String testPojo(User user){
        System.out.println(user.toString());
        return "sucess";
    }

}

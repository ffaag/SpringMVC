package com.it.mvc.controller;

import com.it.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.PanelUI;
import java.io.IOException;

/**
 * @author ZuYingFang
 * @time 2021-08-12 9:14
 */

@Controller
public class HttpController {

    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String RequestBody){
        System.out.println("RequestBody：" + RequestBody);
        return "success";
    }


    @PostMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println("RequestEntity：" + requestEntity);
        System.out.println("Head：" + requestEntity.getHeaders());
        System.out.println("Body：" + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().write("Hello, Response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    // 将Java对象直接作为控制器方法的返回值返回，就会自动转换为Json格式的字符串
    // json就是一个数据传输的格式，两种，json对象和json数组
    public User testResponseUser() {
        return new User(1001, "admin", "123", 23, "男");
    }


    // ajax就是服务器不发生跳转，局部刷新，不会有请求，因此不能用请求转发和请求重定向
    @RequestMapping("testAjax")
    @ResponseBody
    public String testAjax(String username, String password){
        System.out.println(username + ", " +password);
       return "hello axios";
    }
}

package com.it.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZuYingFang
 * @time 2021-08-09 10:22
 */



/*@RequestMapping标识一个类：设置映射请求的请求路径的初始信息,标识一个方法：设置映射请求请求路径的具体信息
  属性里面两个重要的，一个value，是一个数组，可以{"", "" }赋给数组多个值，只要匹配一个就行
  一个method，一般有两种，post和get，也是一个数组，不写默认都匹配，写了就匹配这几种，RequestMethod.POST……*/

@Controller
@RequestMapping(value = "/test")
public class RequestMappingController {


    @RequestMapping(value = {"/testRequestMapping", "test1"}, method = {RequestMethod.POST, RequestMethod.GET})
    public String success(){
        return "sucess";
    }


    @GetMapping(value = "/test3")    // 直接规定是get，不用写method了
    public String testGetMapping(){
        return "sucess";
    }

    @PutMapping(value = "/testPut")
    public String testPut(){
        return "sucess";
    }


    /*    ？：表示任意的单个字符
           *：表示任意的0个或多个字符
          **：表示任意的一层或多层目录
    //     注意：在使用**时，只能使用 /**   //    /xxx的方式*/
    @RequestMapping("/**/testA*")
    public String testAnt(){
        return "sucess";
    }



    @RequestMapping(value = "/testPath/{id}/{username}")
    // 这里1是参数，但是写在地址里面，怎么来获得这个参数呢，方法就是在参数占位的位置加上占位符，如上所示
    public String testPath(@PathVariable("id") Integer id, @PathVariable("username") String username){
        // 上面这个形参就是将地址里面的占位符代表的参数解析出来
        System.out.println(id + username);
        return "sucess";
    }



}

package com.it.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ZuYingFang
 * @time 2021-08-11 9:18
 */

@Controller
public class UserController {
    /**
     * 使用RESTFUL模拟用户资源的增删查改
     * 请求路径都是/user
     * /user       GET       查询所有用户信息
     * /user/1     GET       根据用户id查询用户信息
     * /user       POST      添加用户信息
     * /user/1     DELETE    删除用户信息
     * /user       PUT       修改用户信息
     */

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable Integer id){
        System.out.println("根据id："+ id +"查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insertUser(String username, String password){
        System.out.println("添加用户信息" + "  username：" + username + "   password：" + password);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(String username, String password){
        System.out.println("修改用户信息" + "  username：" + username + "   password：" + password);
        return "success";
    }

}

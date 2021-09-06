package com.it.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author ZuYingFang
 * @time 2021-08-10 10:45
 */


@Controller
public class ScopeController {


    // 使用ServletAPI向request域对象共享数据，原生的不好用，我们用SpringMVC给我们封装的，有四种
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope", "hello,ServletAPI");
        return "success";
    }


    // 1、使用ModelAndView向request域对象共享数据
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        /**
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope", "Hello, ModelAndView");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","Hello, Model");
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map){
        map.put("testRequestScope", "Hello, Map");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope", "Hello, ModelMap");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession httpSession){
        httpSession.setAttribute("testSessionScope", "Hello, Session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession httpSession){
        ServletContext application = httpSession.getServletContext();
        application.setAttribute("testApplicationScope", "Hello, Application");
        return "success";
    }
}

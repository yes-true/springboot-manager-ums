package com.example.springbootmanagerums.controller;

import com.example.springbootmanagerums.entity.Course;
import com.example.springbootmanagerums.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/course")
    public String Classs(Map map){
        List list = new ArrayList();
        list.add(new Course("中华文化传统","","商务礼仪","","Juery"));
        list.add(new Course("","Spark","数据挖掘","数据挖掘","Juery"));
        list.add(new Course("JavaWeb","Spark","数据库技术","",""));
        list.add(new Course("JavaWeb","","数据库技术","",""));
        map.put("cou",list);
        return "course";
    }

    @GetMapping(path = "/")
    public String hello(){
        return "redirect:login";
    }

    @GetMapping(path = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(path = "/index")
    public String index(){
        return "index";
    }
    
}

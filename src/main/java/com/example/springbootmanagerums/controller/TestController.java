package com.example.springbootmanagerums.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

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

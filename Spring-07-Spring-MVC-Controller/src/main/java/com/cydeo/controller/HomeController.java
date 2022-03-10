package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){ // method name is not important
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String welcome(){ // method name is not important
        return "welcome.html";
    }
}

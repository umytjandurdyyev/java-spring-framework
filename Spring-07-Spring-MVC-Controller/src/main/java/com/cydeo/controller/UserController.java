package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String userInfo(){
        return "/user/userinfo.html"; // "userinfo.html" go to folder static and look over there
    }
}

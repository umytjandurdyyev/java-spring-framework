package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student") //  localhost:8080/student/register
public class StudentController {

//    @RequestMapping("/register") // endpoint
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register"; // tell spring return view inside the student folder there is register html
                                    // static --> page does not include data
                                    // templates --> if you are binding any data
    }

//    @RequestMapping("/welcome")  // endpoint
    @GetMapping("/welcome")
    public String info(Model model){

        return "student/welcome";
    }
}

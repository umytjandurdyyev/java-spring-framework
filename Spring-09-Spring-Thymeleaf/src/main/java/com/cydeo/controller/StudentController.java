package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") //  localhost:8080/student/register
public class StudentController {

    @RequestMapping("/register") // endpoint
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register"; // tell spring return view inside the student folder there is register html
                                    // static --> page does not include data
                                    // templates --> if you are binding any data
    }

    @RequestMapping("/welcome")  // endpoint
    public String info(Model model){

        return "student/welcome";
    }
}

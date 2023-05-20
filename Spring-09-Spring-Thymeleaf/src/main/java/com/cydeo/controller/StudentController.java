package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";  // tell spring return view inside the student folder there is register html
                                    // static --> page does not include data
                                    // templates --> if you are binding any data
    }
    @RequestMapping("/welcome")
    public String info(@RequestParam (value = "id") String id, Model model){
        model.addAttribute("id", id);
        return "student/welcome";
    }
}

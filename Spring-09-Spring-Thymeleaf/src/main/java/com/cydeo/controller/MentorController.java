package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @RequestMapping("/list")
    public String mentorList(Model model){
        model.addAttribute("mentors", DataGenerator.createMentor());
        return "mentor/mentor-list";
    }
}

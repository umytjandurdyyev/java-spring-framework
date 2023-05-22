package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.entity.Mentor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @RequestMapping("/list")
    public String mentorList(Model model){
        model.addAttribute("mentors", DataGenerator.createMentor());
        return "mentor/mentor-list";
    }
    @GetMapping("/register")
    public String showMentor(Model model) {
        model.addAttribute("mentor", new Mentor()); // to capture submitted data
        List<String> batchList = Arrays.asList("JD1","JD2","EU1","EU2","B18","B20");
        model.addAttribute("batchList", batchList);
        return "/mentor/mentor-register";
    }
    @PostMapping("/confirm")
    public String showMentor2(@ModelAttribute("mentor") Mentor mentor) {
        System.out.println(mentor.toString());
//        return "/mentor/mentor-confirmation";
        return "redirect:/mentor/register"; //
    }
}

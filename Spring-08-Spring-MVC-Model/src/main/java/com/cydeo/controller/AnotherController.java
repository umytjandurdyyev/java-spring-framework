package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/another") // another/list
public class AnotherController {
    @RequestMapping("/list")     // localhost:8080/another/list
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Hans","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Timmy","Hanks",65, Gender.MALE));
        mentorList.add(new Mentor("Susanna","Bryan",25, Gender.FEMALE));
        model.addAttribute("mentor",mentorList);

        return "mentor/mentor-list";
    }
}

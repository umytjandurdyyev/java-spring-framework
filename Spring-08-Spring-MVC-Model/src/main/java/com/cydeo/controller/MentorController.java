package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("mentor")
    public String mentorList(Model model){
//        Mentor mentor = new Mentor("Mike","Smith",35, Gender.MALE);
        List<Mentor> mentorList = new ArrayList<Mentor>();
        mentorList.add(new Mentor("Mike","Smith",35, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",55, Gender.MALE));
        mentorList.add(new Mentor("Amy","White",25, Gender.FEMALE));
        model.addAttribute("mentors",mentorList);
        return "/mentor/mentor-list";
    }
}

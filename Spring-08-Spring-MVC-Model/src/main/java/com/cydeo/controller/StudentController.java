package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){
        // model methods
        model.addAttribute("name","Cydeo"); // attribute name you can use it in the template
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        int id = new Random().nextInt();
        model.addAttribute("studentId",id);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(99);
        model.addAttribute("numbers",numbers);

        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }
}

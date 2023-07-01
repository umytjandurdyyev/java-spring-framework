package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v2")
public class CourseController_ResponseEntity {

    private final CourseService courseService;


    public CourseController_ResponseEntity(CourseService courseService) {
        this.courseService = courseService;
    }

    /*
    GET
     */
    //localhost:9090/courses/api/v2
    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version","Cydeo v2")
                .header("Operation","Get List")
                .body(courseService.getCourses());
    }

    //localhost:9090/courses/api/v2/2
    @GetMapping("{id}")
    public ResponseEntity<CourseDTO> getCourseById(@PathVariable("id") Long courseId){
        return ResponseEntity.ok(courseService.getCourseById(courseId));
    }

    /*
    POST
     */
    //localhost:9090/courses/api/v2
    @PostMapping
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO course){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Operation", "Created")
                .body(courseService.createCourse(course));
    }
}

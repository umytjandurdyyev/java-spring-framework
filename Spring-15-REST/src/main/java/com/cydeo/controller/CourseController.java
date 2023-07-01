package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controller + @ResponseBody
@RequestMapping("/courses/api/v1")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * GET
     */
    //localhost:9090/courses/api/v1
    @GetMapping
    public List<CourseDTO> getAllCourses(){

        List<CourseDTO> list = courseService.getCourses();
        return list;
    }
    //localhost:9090/courses/api/v1/1
    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long courseId){
        return courseService.getCourseById(courseId);
    }

    //localhost:9090/courses/api/v1/category/React
    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){
        return courseService.getCoursesByCategory(category);
    }

    /**
     * POST
     */
    //localhost:9090/courses/api/v1
    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO course){
        return courseService.createCourse(course);
    }

    /**
     * PUT
     */
    //localhost:9090/courses/api/v1/2
    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") Long courseId, @RequestBody CourseDTO course){
        courseService.updateCourse(courseId, course);
    }

    /**
     * DELETE
     */
    //localhost:9090/courses/api/v1/2
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long courseId){
        courseService.deleteCourseById(courseId);
    }

    @DeleteMapping
    public void deleteCourses(){
        courseService.deleteCourses();
    }
}

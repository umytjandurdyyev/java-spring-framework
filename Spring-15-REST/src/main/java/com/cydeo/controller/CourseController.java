package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controller + @ResponseBody
@RequestMapping("/courses/api/v1")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /*
    GET
     */
    //localhost:8080/courses/api/v1
    @GetMapping
    public List<CourseDTO> getAllCourses(){
        List<CourseDTO> list = courseService.getCourses();
        return list;
    }

    //localhost:8080/courses/api/v1/3 or localhost:8080/courses/api/v1/:id
    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long courseId){
        return courseService.getCourseById(courseId);
    }

    //localhost:8080/courses/category/api/v1/React
    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){
        return courseService.getCoursesByCategory(category);
    }

    /*
    POST
     */
    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO course){
        return courseService.createCourse(course);
    }

    /*
    PUT
     */
    //localhost:8080/courses/api/v1/3
    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") Long courseId, @RequestBody CourseDTO course){
        courseService.updateCourse(courseId,course);
    }

    /*
    DELETE
     */
    //localhost:8080/courses/api/v1/3
    @DeleteMapping("{id}")
    public void deleteCourseId(@PathVariable("id") Long courseId){
        courseService.deleteCourseById(courseId);
    }

    @DeleteMapping
    void deleteCourses(){
        courseService.deleteCourses();
    }
}

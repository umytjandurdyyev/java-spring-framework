package com.cydeo.repository;

import com.cydeo.dto.CourseDTO;
import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllByCategory(String category);
}

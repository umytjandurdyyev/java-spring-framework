package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // display all departments in the furniture department
    List<Department> findByDepartment(String department);

    // display all department in the X division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    // display top 3 departments with division name includes something, without duplicates
    List<Department> findDistinctTop3ByDivisionContaining(String division);

    // department divisions
    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);
}

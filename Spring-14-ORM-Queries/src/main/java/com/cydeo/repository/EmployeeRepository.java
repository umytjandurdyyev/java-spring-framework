package com.cydeo.repository;

import com.cydeo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //display all employees with email address
    List<Employee> findByEmail(String email);

    // display all employees with first bane '' and last name '' also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    // display all employees that first name is not ...
    List<Employee> findByFirstNameIsNot(String firstName);

    // display all employees where last name starts with
    List<Employee> findByLastNameStartsWith(String pattern);

    //display all employees with salaries higher than ..
    List<Employee> findBySalaryGreaterThan(Integer salary);

    // display all employees with salaries less than
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    // display employees that has been hired btw '' and ''
    List<Employee> findByHireDateBetween(LocalDateTime start, LocalDateTime end);

    //display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer integer);

    // display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email='lcasarolib@plala.or.jp'") // Employee is class name 'e' is object name
    Employee getEmployeeDetail();
    @Query("SELECT e.salary FROM Employee e WHERE e.email ='lcasarolib@plala.or.jp'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Employee getEmployeeDetail(String email, int salary);
}

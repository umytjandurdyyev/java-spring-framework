package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    // display all employees with email address
    List<Employee> findByEmail(String employee);

    // display all employees with first bane '' and last name '' also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname, String lastname, String email);

    // display top 5 employees that first name is not ...
    List<Employee> findTop5ByFirstNameIsNot(String firstname);

    // display all employees where last name starts with
    List<Employee> findByLastNameStartsWith(String pattern);

    // display all employees with salaries higher than ..
    List<Employee> findBySalaryGreaterThan(Integer salary);

    // display all employees with salaries less than
    List<Employee> findBySalaryIsLessThanEqual(Integer salary);

    // display employees that has been hired btw '' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    // display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    // display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    // display all employees that do not have email address
    List<Employee> findByEmailIsNull();

}

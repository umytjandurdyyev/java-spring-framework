package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //display all employees with email address


    // display all employees with first bane '' and last name '' also show all employees with an email address

    // display all employees that first name is not ...

    // display all employees where last name starts with

    //display all employees with salaries higher than ..

    // display all employees with salaries less than

    // display employees that has been hired btw '' and ''

    //display all employees where salaries greater and equal to '' in order


    //display top unique 3 employees that is making less than ''

    // display all employees that do not have email address

}

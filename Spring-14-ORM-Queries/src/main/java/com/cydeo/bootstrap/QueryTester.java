package com.cydeo.bootstrap;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class QueryTester implements CommandLineRunner {
    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public QueryTester(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("******************REGION START******************");
        System.out.println("findByCountry: " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry: " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContains: " + regionRepository.findByCountryContains("United"));
        System.out.println("findByCountryContainsOrderByCountry: " + regionRepository.findByCountryContainingOrderByCountry("Asia"));
        System.out.println("findTopByCountry: " + regionRepository.findTop2ByCountry("United States"));
        System.out.println("******************REGION END********************");

        System.out.println("******************DEPARTMENT START******************");
        System.out.println("findByDepartment: " + departmentRepository.findByDepartment("Toys"));
        System.out.println("findByDivisionIs: " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("findByDivisionEquals: " + departmentRepository.findByDivisionEquals("Outdoors"));
        System.out.println("findDistinctTop3ByDivisionContaining: " + departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));
        System.out.println("******************DEPARTMENT END********************");

        System.out.println("******************EMPLOYEE START******************");
        System.out.println("findByEmail: " + employeeRepository.findByEmail("bmanueau0@dion.ne.jp"));
        System.out.println("findByFirstNameIsNot: " + employeeRepository.findTop5ByFirstNameIsNot("Sydney"));
        System.out.println("findByFirstNameAndLastNameOrEmail: " + employeeRepository.findByFirstNameAndLastNameOrEmail("Sydney","Symonds","ssymonds2@hhs.gov"));
        System.out.println("findByLastNameStartsWith: " + employeeRepository.findByLastNameStartsWith("Sy"));
        System.out.println("findBySalaryGreaterThan: " +  employeeRepository.findBySalaryGreaterThan(45000));
        System.out.println("findBySalaryLessThanEqual: " + employeeRepository.findBySalaryIsLessThanEqual(63000));
        System.out.println("findBySalaryGreaterThanEqualOrderBySalaryDesc: " + employeeRepository.findBySalaryGreaterThanEqualOrderBySalaryDesc(75000));
        System.out.println("findDistinctTop3BySalaryLessThan: " + employeeRepository.findDistinctTop3BySalaryLessThan(69000));
        System.out.println("findByEmailIsNull: " + employeeRepository.findByEmailIsNull());
        System.out.println("===================JPQL==========================");
        System.out.println("getEmployeeDetail: " + employeeRepository.getEmployeeDetail());
        System.out.println("getEmployeeSalary: " + employeeRepository.getEmployeeSalary());
        System.out.println("getEmployeeDetail: " + employeeRepository.getEmployeeDetail("amcnee1@google.es"));
        System.out.println("getEmployeeDetail: " + employeeRepository.getEmployeeDetail("amcnee1@google.es",56752));
        System.out.println("******************EMPLOYEE END********************");

        System.out.println("-----------------COURSE START-----------------");
        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println("============");
        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println("============");
        System.out.println(courseRepository.existsByName("Spring"));
        System.out.println("============");
        System.out.println(courseRepository.countByCategory("Spring"));
        System.out.println("============");
        courseRepository.findByNameStartsWith("Getting").forEach(System.out::println);
        System.out.println("============");
        courseRepository.streamByCategory("Spring").forEach(System.out::println);
        System.out.println("-----------------COURSE  END------------------");
    }
}

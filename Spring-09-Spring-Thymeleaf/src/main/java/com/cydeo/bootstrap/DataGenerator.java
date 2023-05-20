package com.cydeo.bootstrap;

import com.cydeo.entity.Mentor;
import com.cydeo.entity.Student;
import com.cydeo.enums.Gender;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<Student> createStudent(){

        List<Student> students = Arrays.asList(
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().address().state()),
                new Student(new Faker().name().firstName(), new Faker().name().lastName(), new Faker().number().numberBetween(20,50), new Faker().address().state())
        );
        return students;
    }
    public static List<Mentor> createMentor(){
        List<Mentor> mentors = Arrays.asList(
                new Mentor(new Faker().name().firstName(), new Faker().name().lastName(),new Faker().name().firstName() + "@" + new Faker().name().lastName() + ".com", Gender.FEMALE),
                new Mentor(new Faker().name().firstName(), new Faker().name().lastName(),new Faker().name().firstName() + "@" + new Faker().name().lastName() + ".com", Gender.MALE),
                new Mentor(new Faker().name().firstName(), new Faker().name().lastName(),new Faker().name().firstName() + "@" + new Faker().name().lastName() + ".com", Gender.FEMALE)
        );
        return mentors;
    }
}

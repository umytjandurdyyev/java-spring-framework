package com.cydeo.model;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName; // first_name

    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient // will not be on a table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birtDateAndTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}

package com.cydeo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String name;
}

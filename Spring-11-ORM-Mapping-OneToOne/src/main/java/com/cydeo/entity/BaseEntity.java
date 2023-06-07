package com.cydeo.entity;

import jakarta.persistence.*;
@MappedSuperclass // I do not want create a table from this class
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

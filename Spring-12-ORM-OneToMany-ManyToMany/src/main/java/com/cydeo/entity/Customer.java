package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends BaseEntity{
    private String userName;
    private String name;
    private String surName;
    private String email;
    private String address;
}

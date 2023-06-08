package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Item extends BaseEntity{
    private String name;
    private String code;
}

package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@Table(name = "departments")
public class Department extends BaseEntity{
    private String department;
    private String division;

//    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}

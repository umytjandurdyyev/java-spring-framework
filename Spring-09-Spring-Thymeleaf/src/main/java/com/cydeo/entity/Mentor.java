package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {

    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private String batch;
    private boolean graduated;
    private String company;

    public Mentor(String firstname, String lastname, String email, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = String.valueOf(Gender.valueOf(String.valueOf(gender)));
    }
}

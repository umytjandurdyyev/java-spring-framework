package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {
    // Field injection
//    @Autowired
//    OfficeHours officeHours;

    // Constructor Injection
    OfficeHours officeHours;
//    @Autowired // After spring 4.3 we do not need @Autowired annotation
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}

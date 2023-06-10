package com.cydeo.enums;

public enum Gender {
    F("Female"), M("Male");
    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

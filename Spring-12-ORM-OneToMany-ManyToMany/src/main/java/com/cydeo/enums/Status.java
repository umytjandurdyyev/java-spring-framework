package com.cydeo.enums;

public enum Status {
    SUCCESS("Success"),FAILURE("Failure");
    private String value;

    Status(String value) {
        this.value = value;
    }
    public String getValue(){return value;}

}

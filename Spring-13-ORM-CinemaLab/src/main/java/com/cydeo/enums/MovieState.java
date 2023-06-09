package com.cydeo.enums;

public enum MovieState {
    ACTIVE("Active"),DRAFT("Draft"),SUSPENDED("Suspended");
     private String value;

    MovieState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

package com.cydeo.enums;

public enum MovieType {
    PREMIER("Premier"),REGULAR("regular");
    private String value;

    MovieType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

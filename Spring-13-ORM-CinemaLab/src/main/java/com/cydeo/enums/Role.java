package com.cydeo.enums;

public enum Role {
    USER("Role"),ADMIN("Admin");
    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

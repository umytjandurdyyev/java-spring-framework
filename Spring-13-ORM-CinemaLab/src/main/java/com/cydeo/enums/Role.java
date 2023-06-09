package com.cydeo.enums;

public enum Role {
    ROLE("Role"),ADMIN("Admin");
    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

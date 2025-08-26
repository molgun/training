package com.example.demo.vo;

public class IdentityNumber {

    private final String value;

    public IdentityNumber(String value) {
        validate(value);
        this.value = value;
    }

    public IdentityNumber change(String value) {
        return new IdentityNumber(value);
    }

    private void validate(String value2) {
        if (value2 == null) {
            throw new IllegalArgumentException();
        }

        if (value2.length() != 13) {
            throw new IllegalArgumentException();
        }
    }

    public String getValue() {
        return value;
    }
}

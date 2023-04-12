package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.stereotype.Component;

public class User {
    private final String email;
    private final String phoneNumber;

    public User(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

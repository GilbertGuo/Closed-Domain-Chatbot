package com.cscc01.chatbot.backend.model;

import com.cscc01.chatbot.backend.model.Role;

public class UserDto {

    private String role;
    private String username;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
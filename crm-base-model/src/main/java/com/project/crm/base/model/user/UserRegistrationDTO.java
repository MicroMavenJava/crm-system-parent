package com.project.crm.base.model.user;

public class UserRegistrationDTO {

    private String username;
    private String password;
    private String email;

    // Constructors, getters, and setters

    public UserRegistrationDTO() {
        // Default constructor
    }

    public UserRegistrationDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

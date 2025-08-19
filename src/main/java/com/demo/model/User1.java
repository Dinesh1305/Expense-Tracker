package com.demo.model;

public class User1 {
    private String email;
    private String password;

    // Getters & Setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "User{email='" + email + "', password='" + password + "'}";
    }
}

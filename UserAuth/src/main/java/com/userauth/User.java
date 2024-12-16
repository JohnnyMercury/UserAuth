package com.userauth;

public class User {
    private String username;
    private String hashedPassword;
    private String firstName;
    private String surname;
    private String email;

    public User(String username, String hashedPassword, String firstName, String surname, String email) {
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}

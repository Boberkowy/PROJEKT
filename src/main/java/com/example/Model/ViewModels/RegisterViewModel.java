package com.example.Model.ViewModels;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Karola on 15.01.2017.
 */
public class RegisterViewModel {

    @Size(min=2, max=25, message = "Your name can not be shorter then 2 and longer then 25")
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @NotNull
    private String username;
    @NotNull
    @Size(min=6, message = "Password must be longer then 6 characters")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
}

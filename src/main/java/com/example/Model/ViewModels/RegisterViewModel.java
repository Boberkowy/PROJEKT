package com.example.Model.ViewModels;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Size;

/**
 * Created by Karola on 15.01.2017.
 */
public class RegisterViewModel {

    @Size(min=2, max=25, message = "Twoje Imie nie może mieć mniej niż 2 litery i więcej jak 25")
    private String username;

    @Size(min=6, message = "Hasło musi miec minimum 6 znaków")
    private String password;

    @Email
    private String email;



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

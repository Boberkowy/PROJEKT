package com.example.Model.Domain;

import com.sun.istack.internal.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.List;
import java.util.Set;

@Entity
public class Client extends Person {


    public Client(){}

  public Client(String username, String password, String email){
    this.setUsername(username);
    this.setPassword(password);
    this.setEmail(email);


  }
    public Client(String firstName, String lastName,String username, String password, String email, String phoneNumber ){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setUsername(username);
        this.setPassword(password);
    }
    public Client(String firstName, String lastName, String email, String phoneNumber, List<Address> addresses,String username, String password){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
//        this.setAddressList(addresses);
        this.setUsername(username);
        this.setPassword(password);
    }


}

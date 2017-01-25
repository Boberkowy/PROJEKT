package com.example.Model.Domain;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Client extends Person {

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "client_address", joinColumns =
    @JoinColumn(name = "clientId"), inverseJoinColumns =
    @JoinColumn(name = "addressId"))
    private List<Address> addresses;

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

    public Client(String firstName, String lastName, String email, String phoneNumber, List<Address> addresses, String username, String password){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setUsername(username);
        this.setPassword(password);
        this.setAddresses(addresses);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public void addAddress(Address address){
        this.getAddresses().add(address);
    }
}

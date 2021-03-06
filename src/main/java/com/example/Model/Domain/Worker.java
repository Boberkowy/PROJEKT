package com.example.Model.Domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Worker extends Person {

    @NotNull
    private String pesel;
    @ManyToOne(optional = true)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    protected Worker() {
    }

    private Worker(String firstName, String lastName, String email, String phoneNumber, String pesel, String username, String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setPesel(pesel);
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}



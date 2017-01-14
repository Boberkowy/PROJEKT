package com.example.Model.Domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Client extends Person {

    @ManyToMany
    @JoinTable(name="Client_Address",
            joinColumns=@JoinColumn(name= "client_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "id"))
    private List<Address> addressList;

    protected Client(){}

    public Client(String firstName, String lastName, String email, String phoneNumber, List<Address> addresses){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setAddressList(addresses);
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}

package com.example.Model.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String region;
    private String city;
    private String zipcode;
    private String street;
    @Column(name="house_number")
    private String number;
    private String userId;

    public Address(){

    }

    public Address(String region, String city, String zipcode, String street, String number, String userId){
        this.setRegion(region);
        this.setCity(city);
        this.setZipcode(zipcode);
        this.setStreet(street);
        this.setNumber(number);
        this.setUserId(userId);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getUserId() {
    return userId;
  }
    public void setUserId(String userId) {
    this.userId = userId;
  }

}

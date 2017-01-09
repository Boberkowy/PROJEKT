package com.example.Model.Domain;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="addressid", unique = true)
    private int id;
    private String region;

    private String city;

    private String zipcode;

    private String street;
    @Column(name="house_number")
    private String number;

    public Address(){

    }

    public Address(String region, String city, String zipcode, String street, String number){
        this.region = region;
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.number = number;
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
}

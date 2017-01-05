package com.example.Model.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String region;
    @NotNull
    private String city;
    @NotNull
    private String zipcode;
    @NotNull
    private String street;
    @NotNull
    @Column(name="house_number")
    private String number;

    protected Address(){}

    public Address(String region, String city, String zipcode, String street, String number){
        this.region = region;
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.number = number;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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

    @Override
    public String toString(){
        return String.format("Address[id='%d',region='%s', city='%s', zipcode='%s', street='%s', number='%s']",
                id, region, city, zipcode, street, number);
    }
}
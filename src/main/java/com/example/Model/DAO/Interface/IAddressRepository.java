package com.example.Model.DAO.Interface;


import com.example.Model.Domain.Address;

import java.util.List;

public interface IAddressRepository extends IRepository<Address>{
    List<Address> withZipcode(String zipcode);
    List<Address> withZipcodeAndStreet(String zipcode, String street);
    Address withZipcodeStreetAndNumber(String zipcode, String street, String number);

}
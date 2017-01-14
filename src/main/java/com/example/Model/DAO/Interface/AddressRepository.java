package com.example.Model.DAO.Interface;


import com.example.Model.Domain.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {
    List<Address> findByZipcode(String zipcode);
   // List<Address> findByZipcodeAndStreet(String zipcode, String street);
   // Address findByZipcodeStreetAndNumber(String zipcode, String street, String number);

}
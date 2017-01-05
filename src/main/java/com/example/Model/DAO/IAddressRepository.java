package com.example.Model.DAO;


import com.example.Model.Domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IAddressRepository extends CrudRepository<Address, Long> {
    List<Address> findByZipcode(String zipcode);
    List<Address> findByZipcodeAndStreet(String zipcode, String street);
    Address findByZipcodeStreetAndNumber(String zipcode, String street, String number);

}
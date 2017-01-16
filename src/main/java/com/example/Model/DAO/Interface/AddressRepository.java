package com.example.Model.DAO.Interface;


import com.example.Model.Domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional

public interface AddressRepository extends CrudRepository<Address, Long> {
    List<Address> findByZipcode(String zipcode);
   // List<Address> findByZipcodeAndStreet(String zipcode, String street);
   // Address findByZipcodeStreetAndNumber(String zipcode, String street, String number);

}

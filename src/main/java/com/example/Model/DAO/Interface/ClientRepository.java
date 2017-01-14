package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Address;
import com.example.Model.Domain.Client;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ClientRepository extends PersonBaseRepository<Client>{
    Client findByAddress(Address address);
}

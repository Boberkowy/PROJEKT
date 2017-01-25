package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Address;
import com.example.Model.Domain.Client;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ClientRepository extends PersonBaseRepository<Client>{
    Client findByUsername(String username);
}

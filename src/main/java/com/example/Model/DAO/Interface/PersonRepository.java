package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Person;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PersonRepository extends PersonBaseRepository<Person> {
       boolean checkLogin(String username, String password);

}

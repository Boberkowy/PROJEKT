package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PersonRepository extends PersonBaseRepository<Person> {

  @Modifying
  @Transactional
  @Query("SELECT 'dtype' FROM Person where username =?1")
  String findRole(String username);
}

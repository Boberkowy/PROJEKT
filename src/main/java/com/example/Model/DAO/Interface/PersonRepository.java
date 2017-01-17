package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Person;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PersonRepository extends PersonBaseRepository<Person> {
<<<<<<< HEAD
       boolean checkLogin(String username, String password);
=======
    Person findByUsername (String username);
>>>>>>> 8d58773a4ab842c2aa0b1b4d28da49a44f52b7df

}

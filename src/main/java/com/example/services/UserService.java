package com.example.services;

import com.example.Model.DAO.Interface.PersonRepository;
import com.example.Model.Domain.Person;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public boolean checkLogin(String username, String password, PersonRepository personRepository) {
        Person person = personRepository.findByUsername(username);
        if(!person.getPassword().equals(password)){
            return false;
        }
        return true;
    }
}

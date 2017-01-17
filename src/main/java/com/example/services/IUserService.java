package com.example.services;

import com.example.Model.DAO.Interface.PersonRepository;

/**
 * Created by Karola on 17.01.2017.
 */
public interface IUserService {
    boolean checkLogin (String username, String Password, PersonRepository personRepository);
}

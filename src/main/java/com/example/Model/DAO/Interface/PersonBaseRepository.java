package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonBaseRepository <T extends Person> extends CrudRepository<T, Long>{
    @Query("Select u.id from #{#entityName} as u where u.firstName =?1")
    public T findById(String id);

  @Query("select u from #{#entityName} as u where u.firstName = ?1 AND u.lastName =?2")
    public T findByFirstNameAndLastName(String firstName, String lastName);
    @Query("select u from #{#entityName} as u where u.email = ?1")
    public T findByEmail(String email);
    @Query("select u from #{#entityName} as u where u.phoneNumber = ?1")
    public T findByPhoneNumber(String phoneNumber);
    Person findByUsername (String username);

}

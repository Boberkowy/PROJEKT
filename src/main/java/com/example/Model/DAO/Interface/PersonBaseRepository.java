package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
public interface PersonBaseRepository <T extends Person> extends CrudRepository<T, Long>{
    @Query("Select u.id from #{#entityName} as u where u.firstName =?1")
    public T findById(String id);



  @Query("select u from #{#entityName} as u where u.firstName = ?1 AND u.lastName =?2")
  public T findByFirstNameAndLastName(String firstName, String lastName);
  public T findByEmail(String email);
  public T findByPhoneNumber(String phoneNumber);
  T findByUsername (String username);





}

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
    public T findByEmail(String email);
    public T findByPhoneNumber(String phoneNumber);
<<<<<<< HEAD
    Person findByUsername (String username);
=======
   T findByUsername (String username);
>>>>>>> 032ba66376ae28a3d0d2c784324e177e0c406758

}

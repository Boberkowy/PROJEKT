package com.example.Model.DAO;

import com.example.Model.DAO.Interface.PersonRepository;
import com.example.Model.Domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Boberkowy on 16.01.2017.
 */

@Repository("PersonDAO")
public abstract class PersonRepositoryImpl implements PersonRepository {


  @Resource(name="sessionFactory")
  protected SessionFactory sessionFactory;

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  protected Session getSession(){
    return sessionFactory.openSession();
  }
    public int checkLogin(String username, String password) {
      Session session = sessionFactory.openSession();
      String hql = "select count(user.id) from Person person"
        + " where username (person.username) = username"
        + " and password(person.password) = password";
      Query query = session.createQuery(hql);
      return ((Number) query.uniqueResult()).intValue();
  }



}

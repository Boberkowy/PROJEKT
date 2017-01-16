//package com.example.Model.DAO;
//
//import com.example.Model.DAO.Interface.PersonRepository;
//import com.example.Model.Domain.Person;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.Resource;
//
///**
// * Created by Boberkowy on 16.01.2017.
// */
//
//@Repository("PersonDAO")
//public abstract class PersonRepositoryImpl implements PersonRepository {
//
//
//  @Resource(name="sessionFactory")
//  protected SessionFactory sessionFactory;
//
//  public void setSessionFactory(SessionFactory sessionFactory) {
//    this.sessionFactory = sessionFactory;
//  }
//
//  protected Session getSession(){
//    return sessionFactory.openSession();
//  }
//    public boolean checkLogin(String username, String password) {
//      Session session = sessionFactory.openSession();
//      String sqlquery =" select username,password from Person as p where p.username =? and p.password=?";
//      Query query = session.createQuery(sqlquery);
//      query.setParameter(0,username);
//      query.setParameter(1,password);
//  }
//
//
//
//}

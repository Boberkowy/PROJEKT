package com.example.Model.DAO;

import com.example.Model.DAO.Interface.IAddressRepository;
import com.example.Model.Domain.Address;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AddressRepository implements IAddressRepository {
    private Query query;
    private final Session session;

    public AddressRepository(Session session){
        this.session = session;
    }
    public Address withId(int id) {
        Address address = new Address();
        address = session.get(Address.class, id);
        return address;
    }

    public void add(Address address) {
        session.save(address);
    }

    public void delete(Address address) {
        session.delete(address);
    }

    public void modify(Address address) {
        session.update(address);
    }

    public List<Address> withZipcode(String zipcode) {
        String withZipcode = "FROM Address WHERE zipcode = :zipcode";
        query = session.createQuery(withZipcode);
        query.setParameter("zipcode", zipcode);
        return query.list();
    }

    public List<Address> withZipcodeAndStreet(String zipcode, String street) {
        String withZipcodeAndStreet = "FROM Address WHERE zipcode = :zipcode AND street = :street";
        query = session.createQuery(withZipcodeAndStreet);
        query.setParameter("zipcode", zipcode);
        query.setParameter("street", street);
        return query.list();
    }

    public Address withZipcodeStreetAndNumber(String zipcode, String street, String houseNumber) {
        String withZipcodeAndStreet = "FROM Address WHERE zipcode = :zipcode AND street = :street AND house_number = : houseNumber";
        query = session.createQuery(withZipcodeAndStreet);
        query.setParameter("zipcode", zipcode);
        query.setParameter("street", street);
        query.setParameter("house_number", houseNumber);
        return (Address) query.getSingleResult();
    }
}
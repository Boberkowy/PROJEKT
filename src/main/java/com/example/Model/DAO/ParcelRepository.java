package com.example.Model.DAO;

import com.example.Model.DAO.Interface.IParcelRepository;
import com.example.Model.Domain.Address;
import com.example.Model.Domain.Parcel;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class ParcelRepository implements IParcelRepository {

    private Query query;
    private Session session;

    public ParcelRepository(Session session){
        this.session = session;
    }

    public void add(Parcel parcel) {
        session.save(parcel);
    }

    public void delete(Parcel parcel) {
        session.delete(parcel);
    }

    public void modify(Parcel parcel) {
        session.update(parcel);
    }


    public Parcel withId(int id) {
        Parcel parcel = new Parcel();
        parcel = session.get(Parcel.class,id);
        return parcel;
    }

    public List<Parcel> withPostingDate(Date date) {
        final String withPostingDate = "FROM Parcel WHERE posting_date = :date";
        query = session.createQuery(withPostingDate);
        query.setParameter("date", date);
        return query.list();
    }

    public List<Parcel> withReceivingAddress(Address address) {
        final String withReceivingAddress = "FROM Parcel WHERE receiving_address =: address";
        query = session.createQuery(withReceivingAddress);
        query.setParameter("address", address);
        return query.list();
    }

    public List<Parcel> withPostingAddress(Address address) {
        final String withReceivingAddress = "FROM Parcel WHERE posting_address =: address";
        query = session.createQuery(withReceivingAddress);
        query.setParameter("address", address);
        return query.list();
    }
}
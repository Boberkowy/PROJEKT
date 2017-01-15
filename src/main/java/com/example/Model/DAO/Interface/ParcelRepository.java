package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Address;
import com.example.Model.Domain.Parcel;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ParcelRepository extends CrudRepository<Parcel, Long> {
    List<Parcel> findByPostingDate(Date date);
    List<Parcel> findByReceivingAddress(Address address);
    List<Parcel> findByPostingAddress(Address address);

}
package com.example.Model.DAO;

import com.example.Model.Domain.Address;
import com.example.Model.Domain.Parcel;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface IParcelRepository extends CrudRepository<Parcel, Long> {
    List<Parcel> findByPostingDate(Date postingDate);
    List<Parcel> findByReceivingAddress(Address receivingAddress);
    List<Parcel> findByPostingAddress(Address postingAddress);

}
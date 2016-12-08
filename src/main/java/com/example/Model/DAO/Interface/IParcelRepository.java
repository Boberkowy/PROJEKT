package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Address;
import com.example.Model.Domain.Parcel;

import java.util.Date;
import java.util.List;

public interface IParcelRepository extends IRepository <Parcel>{
    List<Parcel> withPostingDate(Date date);
    List<Parcel> withReceivingAddress(Address address);
    List<Parcel> withPostingAddress(Address address);

}
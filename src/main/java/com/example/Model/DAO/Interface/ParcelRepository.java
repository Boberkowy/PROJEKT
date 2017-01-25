package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Address;
import com.example.Model.Domain.Parcel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Transactional
public interface ParcelRepository extends CrudRepository<Parcel, Long> {
    List<Parcel> findByCourierId(long courierId);

    @Modifying
    @Transactional
    @Query("UPDATE Parcel Set courier_id = ?1, status = ?2 where id = ?3")
    void setCourierForParcel(long courierId, String status, long parcelId);

}
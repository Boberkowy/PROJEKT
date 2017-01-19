package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Courier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CourierRepository extends PersonBaseRepository<Courier> {
   Courier findByPesel(String pesel);

}

package com.example.Model.DAO.Interface;

import com.example.Model.Domain.Worker;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface WorkerRepository extends PersonBaseRepository<Worker> {
    Worker findByPESEL(String PESEL);
}

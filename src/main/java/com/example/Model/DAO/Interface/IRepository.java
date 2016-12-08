package com.example.Model.DAO.Interface;

public interface IRepository<TEntity> {

    TEntity withId(int id);
    void add(TEntity entity);
    void delete(TEntity entity);
    void modify(TEntity entity);

}
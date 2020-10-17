package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Store;

import java.util.List;

public interface IStoreDAL {
    void add(Store store);

    void update(Store store);

    void delete(Store store);

    List<Store> getAll();

    Store getById(int store_id);

}

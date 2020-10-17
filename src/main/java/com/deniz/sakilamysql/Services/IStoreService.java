package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Store;

import java.util.List;

public interface IStoreService {
    void add(Store store);

    void update(Store store);

    void delete(Store store);

    List<Store> getAll();

    Store getById(int store_id);
}

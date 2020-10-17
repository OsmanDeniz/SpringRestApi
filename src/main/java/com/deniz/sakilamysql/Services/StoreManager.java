package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IStoreDAL;
import com.deniz.sakilamysql.Entities.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class StoreManager implements IStoreService {

    private IStoreDAL dal;

    @Autowired
    public StoreManager(IStoreDAL dal) {
        this.dal = dal;
    }

    @Override
    @Transactional
    public void add(Store store) {
        this.dal.add(store);
    }

    @Override
    @Transactional
    public void update(Store store) {
        this.dal.update(store);
    }

    @Override
    @Transactional
    public void delete(Store store) {
        this.dal.delete(store);
    }

    @Override
    @Transactional
    public List<Store> getAll() {
        return this.dal.getAll();
    }

    @Override
    @Transactional
    public Store getById(int store_id) {
        return this.dal.getById(store_id);
    }
}

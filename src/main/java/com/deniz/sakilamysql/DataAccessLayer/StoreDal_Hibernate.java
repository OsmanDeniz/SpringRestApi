package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Store;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StoreDal_Hibernate implements IStoreDAL {

    private EntityManager manager;

    @Autowired
    public StoreDal_Hibernate(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(Store store) {
        Session session = this.manager.unwrap(Session.class);
        session.save(store);
    }

    @Override
    public void update(Store store) {
        Session session = this.manager.unwrap(Session.class);
        session.update(store);
    }

    @Override
    public void delete(Store store) {
        Session session = this.manager.unwrap(Session.class);
        Store storeToDelete = session.get(Store.class, store.getStore_id());
        session.delete(storeToDelete);
    }

    @Override
    @Transactional
    public List<Store> getAll() {
        Session session = this.manager.unwrap(Session.class);
        List<Store> storeList = session.createQuery("from Store", Store.class).getResultList();
        return storeList;
    }

    @Override
    public Store getById(int store_id) {
        Session session = this.manager.unwrap(Session.class);
        Store store = session.get(Store.class, store_id);
        return store;
    }
}

package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Inventory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class InventoryDAL_Hibernate implements I_InventoryDAL {

    private EntityManager entityManager;
    @Autowired
    public InventoryDAL_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Inventory inventory) {
        Session session = this.entityManager.unwrap(Session.class);
        session.save(inventory);
    }

    @Override
    public void update(Inventory inventory) {
        Session session = this.entityManager.unwrap(Session.class);
        session.update(inventory);
    }

    @Override
    public void delete(Inventory inventory) {
        Session session = this.entityManager.unwrap(Session.class);
        Inventory inventoryToDelete = session.get(Inventory.class,inventory.getInventory_id());
        session.delete(inventoryToDelete);
    }

    @Override
    @Transactional
    public List<Inventory> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<Inventory> inventoryList = session.createQuery("from Inventory ", Inventory.class).getResultList();
        return inventoryList;
    }

    @Override
    public Inventory getById(int inventory_id) {
        Session session = this.entityManager.unwrap(Session.class);
        Inventory inventory = session.get(Inventory.class,inventory_id);
        return inventory;
    }
}

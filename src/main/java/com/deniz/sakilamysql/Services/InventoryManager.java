package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.I_InventoryDAL;
import com.deniz.sakilamysql.Entities.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventoryManager implements I_InventoryService {

    private I_InventoryDAL inventoryDAL;

    @Autowired
    public InventoryManager(I_InventoryDAL inventoryDAL) {
        this.inventoryDAL = inventoryDAL;
    }

    @Override
    @Transactional
    public void add(Inventory inventory) {
        this.inventoryDAL.add(inventory);
    }

    @Override
    @Transactional
    public void update(Inventory inventory) {
        this.inventoryDAL.update(inventory);
    }

    @Override
    @Transactional
    public void delete(Inventory inventory) {
        this.inventoryDAL.delete(inventory);
    }

    @Override
    @Transactional
    public List<Inventory> getAll() {
        return this.inventoryDAL.getAll();
    }

    @Override
    @Transactional
    public Inventory getById(int inventory_id) {
        return this.inventoryDAL.getById(inventory_id);
    }
}

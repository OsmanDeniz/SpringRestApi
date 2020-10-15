package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Inventory;

import java.util.List;

public interface I_InventoryDAL {
    void add(Inventory inventory);

    void update(Inventory inventory);

    void delete(Inventory inventory);

    List<Inventory> getAll();

    Inventory getById(int inventory_id);
}

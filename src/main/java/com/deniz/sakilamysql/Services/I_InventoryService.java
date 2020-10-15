package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Inventory;

import java.util.List;

public interface I_InventoryService {
    void add(Inventory inventory);

    void update(Inventory inventory);

    void delete(Inventory inventory);

    List<Inventory> getAll();

    Inventory getById(int inventory_id);
}

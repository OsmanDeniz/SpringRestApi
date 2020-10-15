package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Inventory;
import com.deniz.sakilamysql.Services.I_InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/inventory")
public class InventoryController {

    private I_InventoryService inventoryService;
    @Autowired
    public InventoryController(I_InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("/add")
    void add(@RequestBody Inventory inventory) {
        this.inventoryService.add(inventory);
    }
    @PostMapping("/update")
    void update(@RequestBody Inventory inventory) {
        this.inventoryService.update(inventory);
    }
    @PostMapping("/delete")
    void delete(@RequestBody Inventory inventory) {
        this.inventoryService.delete(inventory);
    }
    @GetMapping("/")
    List<Inventory> getAll() {
        return this.inventoryService.getAll();
    }
    @GetMapping("/{inventory_id}")
    Inventory getById(@PathVariable int inventory_id) {
        return this.inventoryService.getById(inventory_id);
    }
}

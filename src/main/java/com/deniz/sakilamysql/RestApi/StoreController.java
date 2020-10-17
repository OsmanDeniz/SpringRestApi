package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Store;
import com.deniz.sakilamysql.Services.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/store")
public class StoreController {

    private IStoreService service;

    @Autowired
    public StoreController(IStoreService service) {
        this.service = service;
    }

    @PostMapping("/add")
    void add(@RequestBody Store store) {
        this.service.add(store);
    }

    @PostMapping("/update")
    void update(@RequestBody Store store) {
        this.service.update(store);
    }

    @PostMapping("/delete")
    void delete(@RequestBody Store store) {
        this.service.delete(store);
    }

    @GetMapping("/")
    List<Store> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{store_id}")
    Store getById(@PathVariable int store_id) {
        return this.service.getById(store_id);
    }

}

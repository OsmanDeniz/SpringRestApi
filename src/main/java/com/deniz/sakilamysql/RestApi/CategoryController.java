package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Category;
import com.deniz.sakilamysql.Services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    private ICategoryService service;

    @Autowired
    public CategoryController(ICategoryService categoryService) {
        this.service = categoryService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Category category) {
        this.service.add(category);
    }

    @PostMapping("/update")
    public void update(@RequestBody Category category) {
        this.service.update(category);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Category category) {
        this.service.delete(category);
    }

    @GetMapping("/")
    public List<Category> getAll() {
        return this.service.getAll();
    }


    @GetMapping("/{id}")
    public Category getById(@PathVariable int id) {
        return service.getById(id);
    }


}

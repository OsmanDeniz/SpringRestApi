package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICategoryService {
    void add(Category category);
    void update(Category category);
    void delete(Category category);
    List<Category> getAll();
    Category getById(int category_id);
}

package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Category;

import java.util.List;

public interface ICategoryDAL {
    void add(Category category);
    void update(Category category);
    void delete(Category category);
    List<Category> getAll();
    Category getById(int category_id);
}

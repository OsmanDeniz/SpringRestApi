package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.ICategoryDAL;
import com.deniz.sakilamysql.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategoryManager implements ICategoryService {

    private ICategoryDAL categoryDAL;
    @Autowired
    public CategoryManager(ICategoryDAL categoryDAL) {
        this.categoryDAL = categoryDAL;
    }

    @Override
    @Transactional
    public void add(Category category) {
        this.categoryDAL.add(category);
    }

    @Override
    @Transactional
    public void update(Category category) {
        this.categoryDAL.update(category);
    }

    @Override
    @Transactional
    public void delete(Category category) {
        this.categoryDAL.delete(category);
    }

    @Override
    @Transactional
    public List<Category> getAll() {
        return this.categoryDAL.getAll();
    }

    @Override
    @Transactional
    public Category getById(int category_id) {
        return this.categoryDAL.getById(category_id);
    }
}

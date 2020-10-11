package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Category;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class CategoryDAL_Hibernate implements ICategoryDAL{

    private EntityManager entityManager;
    @Autowired
    public CategoryDAL_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Category category) {
        Session session = entityManager.unwrap(Session.class);
        session.save(category);
    }

    @Override
    public void update(Category category) {
        Session session = entityManager.unwrap(Session.class);
        session.update(category);
    }

    @Override
    public void delete(Category category) {
        Session session = entityManager.unwrap(Session.class);
        Category categoryToDelete = session.get(Category.class,category.getCategory_id());
        session.delete(categoryToDelete);
    }

    @Override
    @Transactional
    public List<Category> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Category> categories = session.createQuery("from Category ",Category.class).getResultList();
        return categories;
    }

    @Override
    public Category getById(int category_id) {
        Session session = entityManager.unwrap(Session.class);
        Category category = session.get(Category.class,category_id);
        return category;
    }
}

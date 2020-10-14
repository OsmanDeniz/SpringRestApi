package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.FilmText;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class FilmText_DAL_Hibernate implements IFilmTextDAL {

    private EntityManager entityManager;

    @Autowired
    public FilmText_DAL_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(FilmText filmText) {
        Session session = this.entityManager.unwrap(Session.class);
        System.out.println("filmText = " + filmText.getFilm_id());
        System.out.println("filmText = " + filmText.getTitle());
        System.out.println("filmText = " + filmText.getDescription());
        session.save(filmText);
    }

    @Override
    public void update(FilmText filmText) {
        Session session = this.entityManager.unwrap(Session.class);
        session.update(filmText);
    }

    @Override
    public void delete(FilmText filmText) {
        Session session = this.entityManager.unwrap(Session.class);
        FilmText filmTextToDelete = session.get(FilmText.class, filmText.getFilm_id());
        session.delete(filmTextToDelete);
    }

    @Override
    @Transactional
    public List<FilmText> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<FilmText> filmTextList = session.createQuery("from FilmText ", FilmText.class).getResultList();
        return filmTextList;
    }

    @Override
    public FilmText getById(int film_id) {
        Session session = this.entityManager.unwrap(Session.class);
        FilmText filmText = session.get(FilmText.class, film_id);
        return filmText;
    }
}

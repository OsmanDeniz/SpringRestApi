package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Film;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class FilmDAL_Hibernate implements IFilmDAL {

    private EntityManager entityManager;

    @Autowired
    public FilmDAL_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Film film) {
        Session session = this.entityManager.unwrap(Session.class);
        session.save(film);
    }

    @Override
    public void update(Film film) {
        Session session = this.entityManager.unwrap(Session.class);
        session.update(film);
    }

    @Override
    public void delete(Film film) {
        Session session = this.entityManager.unwrap(Session.class);
        Film filmToDelete = session.get(Film.class, film.getFilm_id());
        session.delete(filmToDelete);
    }

    @Override
    @Transactional
    public List<Film> getAll() {
        Session session = this.entityManager.unwrap(Session.class);
        List<Film> filmList = session.createQuery("from Film ", Film.class).getResultList();
        return filmList;
    }

    @Override
    public Film getById(int film_id) {
        Session session = this.entityManager.unwrap(Session.class);
        Film film = session.get(Film.class, film_id);
        return film;
    }
}

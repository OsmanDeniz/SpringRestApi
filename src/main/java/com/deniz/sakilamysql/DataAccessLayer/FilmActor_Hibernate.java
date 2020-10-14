package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.FilmActor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class FilmActor_Hibernate implements IFilmActorDAL {

    private EntityManager entityManager;
    @Autowired
    public FilmActor_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(FilmActor filmActor) {
        Session session = entityManager.unwrap(Session.class);
        session.save(filmActor);
    }

    @Override
    public void update(FilmActor filmActor) {
        Session session = entityManager.unwrap(Session.class);
        session.update(filmActor);
    }

    @Override
    public void delete(FilmActor filmActor) {
        Session session = entityManager.unwrap(Session.class);
        FilmActor actorToDelete = session.get(FilmActor.class,filmActor.getActor_id());
        session.delete(actorToDelete);
    }

    @Override
    @Transactional
    public List<FilmActor> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<FilmActor> filmActorList = session.createQuery("from FilmActor ",FilmActor.class).getResultList();
        return filmActorList;
    }

    @Override
    @Transactional
    public List<FilmActor> getFilmByActorId(int actor_id) {
        Session session = entityManager.unwrap(Session.class);
        List<FilmActor> filmActorList = session.createQuery("from FilmActor fa where actor_id=:param1",FilmActor.class).setParameter("param1",actor_id).getResultList();
        return filmActorList;
    }

/*
    @Override
    public List<FilmActor> getActorByFilmId(int film_id) {
        Session session = entityManager.unwrap(Session.class);
        List<FilmActor> actorFilmList = session.createQuery("from FilmActor fa where film_id=:param2",FilmActor.class).setParameter("param2",film_id).getResultList();
        return actorFilmList;
    }
*/


   /* @Override
    public FilmActor getById(int actor_id,int film_id) {
        Session session = entityManager.unwrap(Session.class);
        FilmActor filmActor = (FilmActor)
                this.entityManager.createQuery("from FilmActor fa where fa.actor_id=:param1 and fa.film_id=:param2").setParameter("param1",actor_id).setParameter("param2",film_id).getSingleResult();
        return filmActor;
    }*/
}

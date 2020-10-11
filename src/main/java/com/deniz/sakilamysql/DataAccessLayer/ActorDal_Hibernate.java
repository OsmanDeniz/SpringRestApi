package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Actor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ActorDal_Hibernate implements IActorDal {

    private EntityManager entityManager;

    @Autowired
    public ActorDal_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Actor actor) {
        Session session = entityManager.unwrap(Session.class);
        session.save(actor);
    }

    @Override
    public void update(Actor actor) {
        Session session = entityManager.unwrap(Session.class);
        session.update(actor);
    }

    @Override
    public void delete(Actor actor) {
        Session session = entityManager.unwrap(Session.class);
        Actor actorToDelete = session.get(Actor.class, actor.getActor_id());
        session.delete(actorToDelete);
    }

    @Override
    @Transactional
    public List<Actor> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Actor> actorList = session.createQuery("from Actor ", Actor.class).getResultList();
        return actorList;
    }

    @Override
    public Actor getById(int actor_id) {
        Session session = entityManager.unwrap(Session.class);
        Actor actor = session.get(Actor.class, actor_id);
        return actor;
    }
}

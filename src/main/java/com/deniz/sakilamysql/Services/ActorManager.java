package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IActorDal;
import com.deniz.sakilamysql.Entities.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActorManager implements IActorService {

    private IActorDal actorDal;

    @Autowired
    public ActorManager(IActorDal actorDal) {
        this.actorDal = actorDal;
    }

    @Override
    @Transactional
    public void add(Actor actor) {
        this.actorDal.add(actor);
    }

    @Override
    @Transactional
    public void update(Actor actor) {
        this.actorDal.update(actor);
    }

    @Override
    @Transactional
    public void delete(Actor actor) {

        this.actorDal.delete(actor);
    }

    @Override
    @Transactional
    public List<Actor> getAll() {
        return this.actorDal.getAll();
    }

    @Override
    @Transactional
    public Actor getById(int actor_id) {
        return this.actorDal.getById(actor_id);
    }
}

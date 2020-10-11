package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Actor;

import java.util.List;

public interface IActorDal {
    void add(Actor actor);

    void update(Actor actor);

    void delete(Actor actor);

    List<Actor> getAll();

    Actor getById(int actor_id);
}

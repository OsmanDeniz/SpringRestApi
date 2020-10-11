package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Actor;

import java.util.List;

public interface IActorService {
    void add(Actor actor);
    void update(Actor actor);
    void delete(Actor actor);
    List<Actor> getAll();
    Actor getById(int actor_id);
}

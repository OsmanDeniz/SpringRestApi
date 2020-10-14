package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.FilmActor;

import java.util.List;

public interface IFilmActor_Service {
    void add(FilmActor filmActor);

    void update(FilmActor filmActor);

    void delete(FilmActor filmActor);

    List<FilmActor> getAll();

    List<FilmActor> getFilmByActorId(int actor_id);

//    List<FilmActor> getActorByFilmId(int film_id);
}

package com.deniz.sakilamysql.Entities;

import javax.persistence.*;
/*
* Bu nesne icin Compose Key uygulamasi yapilacak
* */
@Entity
@Table(name = "film_actor")
public class FilmActor {

    @Column(name = "actor_id")
    private int actor_id;
    @Id
    @Column(name = "film_id")
    private int film_id;
    @Column(name = "last_update")
    private String last_update;

    public FilmActor() {
    }

    public FilmActor(int actor_id, int film_id, String last_update) {
        this.actor_id = actor_id;
        this.film_id = film_id;
        this.last_update = last_update;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}

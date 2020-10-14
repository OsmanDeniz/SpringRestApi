package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Film;

import java.util.List;

public interface IFilmDAL {
    void add(Film film);

    void update(Film film);

    void delete(Film film);

    List<Film> getAll();

    Film getById(int film_id);
}

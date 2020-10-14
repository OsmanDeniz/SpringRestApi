package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Film;

import java.util.List;

public interface IFilmService {
    void add(Film film);

    void update(Film film);

    void delete(Film film);

    List<Film> getAll();

    Film getById(int film_id);
}

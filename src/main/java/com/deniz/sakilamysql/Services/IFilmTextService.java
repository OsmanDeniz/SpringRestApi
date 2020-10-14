package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.FilmText;

import java.util.List;

public interface IFilmTextService {

    void add(FilmText filmText);

    void update(FilmText filmText);

    void delete(FilmText filmText);

    List<FilmText> getAll();

    FilmText getById(int film_id);
}

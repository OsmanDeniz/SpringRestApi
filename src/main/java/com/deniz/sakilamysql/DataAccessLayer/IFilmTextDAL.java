package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.FilmText;

import java.util.List;

public interface IFilmTextDAL {

    void add(FilmText filmText);

    void update(FilmText filmText);

    void delete(FilmText filmText);

    List<FilmText> getAll();

    FilmText getById(int film_id);
}

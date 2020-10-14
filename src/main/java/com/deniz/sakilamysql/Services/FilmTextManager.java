package com.deniz.sakilamysql.Services;


import com.deniz.sakilamysql.DataAccessLayer.IFilmTextDAL;
import com.deniz.sakilamysql.Entities.FilmText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class FilmTextManager implements IFilmTextService{

    private IFilmTextDAL filmTextDAL;
    @Autowired
    public FilmTextManager(IFilmTextDAL filmTextDAL) {
        this.filmTextDAL = filmTextDAL;
    }

    @Override
    @Transactional
    public void add(FilmText filmText) {
        this.filmTextDAL.add(filmText);
    }

    @Override
    @Transactional
    public void update(FilmText filmText) {
        this.filmTextDAL.update(filmText);
    }

    @Override
    @Transactional
    public void delete(FilmText filmText) {
        this.filmTextDAL.delete(filmText);
    }

    @Override
    @Transactional
    public List<FilmText> getAll() {
        return this.filmTextDAL.getAll();
    }

    @Override
    @Transactional
    public FilmText getById(int film_id) {
        return this.filmTextDAL.getById(film_id);
    }
}

package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IFilmDAL;
import com.deniz.sakilamysql.Entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmManager implements IFilmService {

    private IFilmDAL filmDAL;

    @Autowired
    public FilmManager(IFilmDAL filmDAL) {
        this.filmDAL = filmDAL;
    }

    @Override
    @Transactional
    public void add(Film film) {
        this.filmDAL.add(film);
    }

    @Override
    @Transactional
    public void update(Film film) {
        this.filmDAL.update(film);
    }

    @Override
    @Transactional
    public void delete(Film film) {
        this.filmDAL.delete(film);
    }

    @Override
    @Transactional
    public List<Film> getAll() {
        return this.filmDAL.getAll();
    }

    @Override
    @Transactional
    public Film getById(int film_id) {
        return this.filmDAL.getById(film_id);
    }
}

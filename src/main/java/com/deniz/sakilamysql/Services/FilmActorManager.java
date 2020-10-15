package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IFilmActorDAL;
import com.deniz.sakilamysql.Entities.Film;
import com.deniz.sakilamysql.Entities.FilmActor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class FilmActorManager implements IFilmActor_Service{

    private IFilmActorDAL filmActorDAL;
    @Autowired
    public FilmActorManager(IFilmActorDAL filmActorDAL) {
        this.filmActorDAL = filmActorDAL;
    }

    @Override
    @Transactional
    public void add(FilmActor filmActor) {
        this.filmActorDAL.add(filmActor);
    }

    @Override
    @Transactional
    public void update(FilmActor filmActor) {
        this.filmActorDAL.update(filmActor);
    }

    @Override
    @Transactional
    public void delete(FilmActor filmActor) {
        this.filmActorDAL.delete(filmActor);
    }

    @Override
    @Transactional
    public List<FilmActor> getAll() {
        return this.filmActorDAL.getAll();
    }

    @Override
    @Transactional
    public List<FilmActor> getFilmByActorId(int actor_id) {
        return this.filmActorDAL.getFilmByActorId(actor_id);
    }
/*

    @Override
    public List<FilmActor> getActorByFilmId(int film_id) {
        return this.filmActorDAL.getActorByFilmId(film_id);
    }
*/

/*    @Override
    public FilmActor getById(int actor_id, int film_id) {
        return this.filmActorDAL.getById(actor_id,film_id);
    }*/


}

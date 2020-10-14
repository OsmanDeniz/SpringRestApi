package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.FilmActor;
import com.deniz.sakilamysql.Services.IFilmActor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/filmactor")
public class FilmActorController {

    private IFilmActor_Service filmActorService;

    @Autowired
    public FilmActorController(IFilmActor_Service filmActorService) {
        this.filmActorService = filmActorService;
    }

    @PostMapping("/add")
    void add(@RequestBody FilmActor filmActor) {
        this.filmActorService.add(filmActor);
    }

    @PostMapping("/update")
    void update(@RequestBody FilmActor filmActor) {
        this.filmActorService.update(filmActor);
    }

    @PostMapping("/delete")
    void delete(@RequestBody FilmActor filmActor) {
        this.filmActorService.delete(filmActor);
    }

    @GetMapping("/")
    List<FilmActor> getAll() {
        return this.filmActorService.getAll();
    }

    @GetMapping("/getfilms/{actor_id}")
    List<FilmActor> getFilmByActorId(@PathVariable int actor_id) {
        return this.filmActorService.getFilmByActorId(actor_id);
    }
/*
    @GetMapping("getactors/{film_id}")
    List<FilmActor> getActorByFilmId(@PathVariable int film_id) {
        return this.filmActorService.getActorByFilmId(film_id);
    }*/
}

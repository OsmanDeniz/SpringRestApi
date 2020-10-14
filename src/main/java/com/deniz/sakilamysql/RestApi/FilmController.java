package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Film;
import com.deniz.sakilamysql.Services.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/film")
public class FilmController {

    private IFilmService filmService;

    @Autowired
    public FilmController(IFilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping("/add")
    void add(@RequestBody Film film) {
        this.filmService.add(film);
    }

    @PostMapping("/update")
    void update(@RequestBody Film film) {
        this.filmService.update(film);
    }

    @PostMapping("/delete")
    void delete(@RequestBody Film film) {
        this.filmService.delete(film);
    }

    @GetMapping("/")
    List<Film> getAll() {
        return this.filmService.getAll();
    }

    @GetMapping("/{film_id}")
    Film getById(@PathVariable int film_id) {
        return this.filmService.getById(film_id);
    }
}

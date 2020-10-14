package com.deniz.sakilamysql.RestApi;


import com.deniz.sakilamysql.Entities.FilmText;
import com.deniz.sakilamysql.Services.IFilmTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/filmtext")
public class FilmTextController {

    private IFilmTextService filmTextService;
    @Autowired
    public FilmTextController(IFilmTextService filmTextService) {
        this.filmTextService = filmTextService;
    }

    @PostMapping("/add")
    void add(@RequestBody FilmText filmText){
        this.filmTextService.add(filmText);
    }
    @PostMapping("/update")
    void update(@RequestBody FilmText filmText){
        this.filmTextService.update(filmText);
    }
    @PostMapping("/delete")
    void delete(@RequestBody FilmText filmText){
        this.filmTextService.delete(filmText);
    }
    @GetMapping("/")
    List<FilmText> getAll(){
        return this.filmTextService.getAll();
    }
    @GetMapping("/{film_id}")
    FilmText getById(@PathVariable int film_id){
        return this.filmTextService.getById(film_id);
    }
}

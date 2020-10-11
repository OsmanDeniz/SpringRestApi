package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Actor;
import com.deniz.sakilamysql.Services.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/actor")
public class ActorController {
    private IActorService service;

    @Autowired
    public ActorController(IActorService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void add(@RequestBody Actor actor) {
        this.service.add(actor);
    }

    @PostMapping("/update")
    public void update(@RequestBody Actor actor) {
        this.service.update(actor);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Actor actor) {
        this.service.delete(actor);
    }

    @GetMapping("/")
    public List<Actor> getAll() {
        return this.service.getAll();
    }


    @GetMapping("/{id}")
    public Actor getById(@PathVariable int id) {
        return service.getById(id);
    }

}

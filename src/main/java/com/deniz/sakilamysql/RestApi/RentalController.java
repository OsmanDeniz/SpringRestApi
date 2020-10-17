package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Rental;
import com.deniz.sakilamysql.Services.IRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rental")
public class RentalController {

    private IRentalService service;

    @Autowired
    public RentalController(IRentalService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void add(@RequestBody Rental rental) {
        this.service.add(rental);
    }

    @PostMapping("/update")
    public void update(@RequestBody Rental rental) {
        this.service.update(rental);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Rental rental) {
        this.service.delete(rental);
    }

    @GetMapping("/")
    public List<Rental> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{rental_id}")
    public Rental getById(@PathVariable int rental_id) {
        return this.service.getById(rental_id);
    }
}

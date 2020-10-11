package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.City;
import com.deniz.sakilamysql.Services.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/city")
public class CityController {
    private ICityService cityService;

    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/add")
    void add(@RequestBody City city) {
        this.cityService.add(city);
    }

    @PostMapping("/update")
    void update(@RequestBody City city) {
        this.cityService.update(city);
    }


    @PostMapping("/delete")
    void delete(@RequestBody City city) {
        this.cityService.delete(city);
    }

    @GetMapping("/")
    List<City> getAll() {
        return this.cityService.getAll();
    }

    @GetMapping("/{city_id}")
    City getById(@PathVariable int city_id) {
        return this.cityService.getById(city_id);
    }

}

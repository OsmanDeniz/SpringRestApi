package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Country;
import com.deniz.sakilamysql.Services.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    private ICountryService countryService;

    @Autowired
    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping("/add")
    void add(@RequestBody Country country) {
        this.countryService.add(country);
    }

    @PostMapping("/update")
    void update(@RequestBody Country country) {
        this.countryService.update(country);

    }

    @PostMapping("/delete")
    void delete(@RequestBody Country country) {
        this.countryService.delete(country);
    }

    @GetMapping("/")
    List<Country> getAll() {
        return this.countryService.getAll();
    }

    @GetMapping("/{country_id}")
    Country getById(@PathVariable int country_id) {
        return this.countryService.getById(country_id);
    }
}

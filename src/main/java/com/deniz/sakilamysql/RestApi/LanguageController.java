package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Language;
import com.deniz.sakilamysql.Services.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/language")
public class LanguageController {

    private ILanguageService service;

    @Autowired
    public LanguageController(ILanguageService service) {
        this.service = service;
    }

    @PostMapping("/add")
    void add(@RequestBody Language language) {
        this.service.add(language);
    }

    @PostMapping("/update")
    void update(@RequestBody Language language) {
        this.service.update(language);
    }

    @PostMapping("/delete")
    void delete(@RequestBody Language language) {
        this.service.delete(language);
    }

    @GetMapping("/")
    List<Language> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{language_id}")
    Language getById(@PathVariable int language_id) {
        return this.service.getById(language_id);
    }

}

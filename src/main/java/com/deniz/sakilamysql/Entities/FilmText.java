package com.deniz.sakilamysql.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "film_text")
public class FilmText {
    @Id
    @Column(name = "film_id")
    /*GeneratedValue olmadigi icin ekleme sirasinda id elle verilmelidir.*/
    private int film_id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;

    public FilmText() {
    }

    public FilmText(int film_id, String title, String description) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

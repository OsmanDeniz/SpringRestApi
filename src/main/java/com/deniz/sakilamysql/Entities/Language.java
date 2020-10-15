package com.deniz.sakilamysql.Entities;

import javax.persistence.*;
@Entity
@Table(name="language")
public class Language {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="language_id")
    private int language_id;
    @Column(name="name")
    private String name;
    @Column(name="last_update")
    private String last_update;

    public Language() {
    }

    public Language(int language_id, String name, String last_update) {
        this.language_id = language_id;
        this.name = name;
        this.last_update = last_update;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}

package com.deniz.sakilamysql.Entities;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country_id")
    private int country_id;
    @Column(name = "country")
    private String country;
    @Column(name="last_update")
    private String last_update;

    public Country() {}

    public Country(int country_id, String country, String last_update) {
        this.country_id = country_id;
        this.country = country;
        this.last_update = last_update;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}

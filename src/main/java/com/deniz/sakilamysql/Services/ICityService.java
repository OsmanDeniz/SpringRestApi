package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.City;

import java.util.List;

public interface ICityService {
    void add(City city);

    void update(City city);

    void delete(City city);

    List<City> getAll();

    City getById(int city_id);
}

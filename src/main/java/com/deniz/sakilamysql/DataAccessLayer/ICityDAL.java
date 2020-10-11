package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.City;

import java.util.List;

public interface ICityDAL {
    void add(City city);

    void update(City city);

    void delete(City city);

    List<City> getAll();

    City getById(int city_id);
}

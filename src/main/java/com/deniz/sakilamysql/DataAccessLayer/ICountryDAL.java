package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Country;

import java.util.List;

public interface ICountryDAL {
    void add(Country country);

    void update(Country country);

    void delete(Country country);

    List<Country> getAll();

    Country getById(int country_id);
}

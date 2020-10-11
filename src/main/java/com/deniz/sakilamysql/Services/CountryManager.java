package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.ICountryDAL;
import com.deniz.sakilamysql.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryManager implements ICountryService {

    private ICountryDAL countryDAL;

    @Autowired
    public CountryManager(ICountryDAL countryDAL) {
        this.countryDAL = countryDAL;
    }

    @Override
    @Transactional
    public void add(Country country) {
        this.countryDAL.add(country);
    }

    @Override
    @Transactional
    public void update(Country country) {
        this.countryDAL.update(country);
    }

    @Override
    @Transactional
    public void delete(Country country) {
        this.countryDAL.delete(country);
    }

    @Override
    @Transactional
    public List<Country> getAll() {
        return this.countryDAL.getAll();
    }

    @Override
    @Transactional
    public Country getById(int country_id) {
        return this.countryDAL.getById(country_id);
    }
}

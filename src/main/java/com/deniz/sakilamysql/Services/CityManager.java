package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.ICityDAL;
import com.deniz.sakilamysql.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityManager implements ICityService {

    private ICityDAL cityDAL;

    @Autowired
    public CityManager(ICityDAL cityDAL) {
        this.cityDAL = cityDAL;
    }

    @Override
    @Transactional
    public void add(City city) {
        this.cityDAL.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDAL.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDAL.delete(city);
    }

    @Override
    @Transactional
    public List<City> getAll() {
        return this.cityDAL.getAll();
    }

    @Override
    @Transactional
    public City getById(int city_id) {
        return this.cityDAL.getById(city_id);
    }
}

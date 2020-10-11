package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CityDAL_Hibernate implements ICityDAL {

    private EntityManager manager;

    @Autowired
    public CityDAL_Hibernate(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(City city) {
        Session session = this.manager.unwrap(Session.class);
        session.save(city);
    }

    @Override
    public void update(City city) {
        Session session = this.manager.unwrap(Session.class);
        session.update(city);
    }

    @Override
    public void delete(City city) {
        Session session = this.manager.unwrap(Session.class);
        City cityToDelete = session.get(City.class, city.getCity_id());
        session.delete(cityToDelete);
    }

    @Override
    @Transactional
    public List<City> getAll() {
        Session session = this.manager.unwrap(Session.class);
        List<City> cities = session.createQuery("from City ", City.class).getResultList();
        return cities;
    }

    @Override
    public City getById(int city_id) {
        Session session = this.manager.unwrap(Session.class);
        City city = session.get(City.class, city_id);
        return city;
    }
}

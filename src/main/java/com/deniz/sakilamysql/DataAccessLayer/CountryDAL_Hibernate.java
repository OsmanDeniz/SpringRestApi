package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Country;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class CountryDAL_Hibernate implements ICountryDAL {

    private EntityManager manager;
    @Autowired
    public CountryDAL_Hibernate(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(Country country) {
        Session session = manager.unwrap(Session.class);
        session.save(country);
    }

    @Override
    public void update(Country country) {
        Session session = manager.unwrap(Session.class);
        session.update(country);
    }

    @Override
    public void delete(Country country) {
        Session session = manager.unwrap(Session.class);
        Country countryToDelete = session.get(Country.class,country.getCountry_id());
        session.delete(countryToDelete);
    }

    @Override
    @Transactional
    public List<Country> getAll() {
        Session session = manager.unwrap(Session.class);
        List<Country> countries = session.createQuery("from Country",Country.class).getResultList();
        return countries;
    }

    @Override
    public Country getById(int country_id) {
        Session session = manager.unwrap(Session.class);
        Country country = session.get(Country.class,country_id);
        return country;
    }
}
